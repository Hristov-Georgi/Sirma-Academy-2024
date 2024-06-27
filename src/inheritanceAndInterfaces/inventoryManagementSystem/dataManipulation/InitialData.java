package inheritanceAndInterfaces.inventoryManagementSystem.dataManipulation;

import inheritanceAndInterfaces.inventoryManagementSystem.enums.Category;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.ElectronicItem;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.FragileItem;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.GroceryItem;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.InventoryItem;

import java.io.*;
import java.util.*;

/**
 * Provides static methods for reading (to load) initial data when program starts for first time.
 * When program finish execution saves the final data into the same file.
 */

public class InitialData {

    /**
     * Method reads all data from resources.itemsData.txt and returns Map from valid data.
     * Map key is the product id, map value is list of inventory items.
     * If data is in invalid format then it is added in wrongDataFormat list.
     * if grocery products have expired date then the expired product is added in expiredProductList and
     * could be displayed to grocery workers for further handling.
     */

    public static Map<Integer, InventoryItem> loadItems(List<String> wrongDataFormat, List<InventoryItem> expiredProductsList) {
        Map<Integer, InventoryItem> itemsMap = new HashMap<>();

        File itemsData = new File("src/inheritanceAndInterfaces/inventoryManagementSystem/resources/itemsData.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(itemsData))) {

            String currentReadLine = reader.readLine();

            while (currentReadLine != null) {

                String[] singleData = currentReadLine.split(",\\s+");

                try {
                    int id = Integer.parseInt(singleData[0]);
                    String category = singleData[1];
                    double price = Double.parseDouble(singleData[2]);
                    String name = singleData[3];



                    if (category.toUpperCase().equals(Category.GROCERY.name())) {
                        double quantity = Double.parseDouble(singleData[4]);
                        String expirationDate = singleData[5];

                        InventoryItem groceryItem = new GroceryItem(id, category, price, name,quantity, expirationDate);

                        if (groceryItem.isExpired()) {
                            expiredProductsList.add(groceryItem);
                        } else {

                            if (itemsMap.containsKey(id)) {
                                double currentItemQuantity = itemsMap.get(id).getQuantity();

                                itemsMap.get(id).setQuantity(quantity + currentItemQuantity);
                            }

                            itemsMap.putIfAbsent(id, groceryItem);

                        }

                    } else if (category.toUpperCase().equals(Category.ELECTRONIC.name())) {

                        double quantity = Double.parseDouble(singleData[4]);
                        double weight = Double.parseDouble(singleData[5]);

                        if (itemsMap.containsKey(id)) {
                            double currentItemQuantity = itemsMap.get(id).getQuantity();
                            double  currentItemWeight = ((FragileItem) itemsMap.get(id)).getWeight();

                            itemsMap.get(id).setQuantity(currentItemQuantity + quantity);
                            ((FragileItem) itemsMap.get(id)).setWeight(currentItemWeight + weight);
                        }

                        itemsMap.putIfAbsent(id, new ElectronicItem(id, category, price, name, quantity, weight));

                    } else {

                        wrongDataFormat.add(currentReadLine);

                    }
                } catch (Exception ex) {

                    wrongDataFormat.add(currentReadLine);
                    currentReadLine = reader.readLine();
                    continue;

                }

                currentReadLine = reader.readLine();
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return itemsMap;

    }

    /**
     * Method writes final inventory data when the program end execution.
     * Data is stored in itemsData.txt file (same file where we read the initial item data).
     * Method use Class toString method to write the result in file.
     */

    public static void writeItemsToFile(Map<Integer, InventoryItem> inventoryStorageMap) {

        File itemsData = new File("src/inheritanceAndInterfaces/inventoryManagementSystem/resources/itemsData.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(itemsData))) {

            for (Map.Entry<Integer, InventoryItem> m : inventoryStorageMap.entrySet()) {

                    writer.write(m.getValue().toString());
                    writer.newLine();

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }



    public static void printIndexPage(Map<Integer, InventoryItem> inventoryStorageMap) {
        System.out.println();
        System.out.printf("WELCOME!%nE-commerce console application!%n");
        System.out.println();
        System.out.println("Feel free to choose from our products list:");
        System.out.println();
        System.out.println("ID, Category, Price, Name, Quantity, Exp. date");
        InitialData.listAllProducts(inventoryStorageMap);

        System.out.println();
        System.out.println("Menu:");
        System.out.println("1. add id Quantity - type \"add\" command followed by product id number and product quantity to add product in shopping cart");
        System.out.println("2. sort option - type \"sort\" followed by current options: name, id, category or price. Display sorted items.");
        System.out.println("3. remove id - type \"remove\" followed by product id number to remove product from shopping cart");
        System.out.println("4. cart - type \"cart\" to list all added products");
        System.out.println("5. order - type \"order\" to set an order");
        System.out.println("Type and enjoy :)");
    }

    public static void sortById(Map<Integer, InventoryItem> inventoryStorageMap) {
        List<Integer> keys = new ArrayList<>();

        for (Map.Entry<Integer, InventoryItem> i : inventoryStorageMap.entrySet()) {
            keys.add(i.getKey());
        }

        Collections.sort(keys);

        keys.forEach(i -> System.out.println(inventoryStorageMap.get(i)));

    }

    public static void sortByName(Map<Integer, InventoryItem> inventoryStorageMap) {

        inventoryStorageMap
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(i -> i.getValue().getName().toLowerCase()))
                .forEach(i -> System.out.println(i.getValue()));

    }

    private static void listAllProducts(Map<Integer, InventoryItem> products) {

        for (Map.Entry<Integer, InventoryItem> i : products.entrySet()) {

            System.out.println(i.getValue());
        }

    }

}
