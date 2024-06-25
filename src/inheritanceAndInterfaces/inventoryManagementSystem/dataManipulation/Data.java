package inheritanceAndInterfaces.inventoryManagementSystem.dataManipulation;

import inheritanceAndInterfaces.inventoryManagementSystem.enums.Category;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.ElectronicItem;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.GroceryItem;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.InventoryItem;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {

    /**
     * Method reads all data from resources.itemsData.txt and returns Map of valid data.
     * Maps key is the product id, maps value is list of inventory items.
     * If data is in invalid format then it is added in wrongDataFormat list.
     * if grocery products have expired date then the expired product is added in expiredProductList and
     * could be displayed to grocery workers for further handling.
     */

    public static Map<Integer, List<InventoryItem>> loadItems(List<String> wrongDataFormat, List<InventoryItem> expiredProductsList) {
        Map<Integer, List<InventoryItem>> itemsMap = new HashMap<>();

        File itemsData = new File("src/inheritanceAndInterfaces/inventoryManagementSystem/resources/itemsData.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(itemsData))) {

            String line = reader.readLine();

            while (line != null) {

                String[] singleData = line.split(",\\s+");

                try {
                    String category = singleData[0];
                    double price = Double.parseDouble(singleData[1]);
                    int id = Integer.parseInt(singleData[2]);

                    if (category.toUpperCase().equals(Category.GROCERY.name())) {
                        double quantity = Double.parseDouble(singleData[3]);
                        String expirationDate = singleData[4];

                        InventoryItem groceryItem = new GroceryItem(category, price, id, quantity, expirationDate);

                        if (groceryItem.isExpired()) {
                            expiredProductsList.add(groceryItem);
                        } else {
                            itemsMap.putIfAbsent(id, new ArrayList<>());
                            itemsMap.get(id).add(groceryItem);
                        }


                    } else if (category.toUpperCase().equals(Category.ELECTRONIC.name())) {

                        double quantity = Double.parseDouble(singleData[3]);
                        double weight = Double.parseDouble(singleData[4]);

                        InventoryItem electronicItem = new ElectronicItem(category, price, id, quantity, weight);

                        itemsMap.putIfAbsent(id, new ArrayList<>());
                        itemsMap.get(id).add(electronicItem);
                    } else {

                        wrongDataFormat.add(line);

                    }
                } catch (Exception ex) {

                    wrongDataFormat.add(line);
                    line = reader.readLine();
                    continue;

                }

                line = reader.readLine();
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

    public static void writeItemsToFile(Map<Integer, List<InventoryItem>> inventoryStorageMap) {

        File itemsData = new File("src/inheritanceAndInterfaces/inventoryManagementSystem/resources/itemsData.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(itemsData))) {

            for (Map.Entry<Integer, List<InventoryItem>> m : inventoryStorageMap.entrySet()) {

                for (InventoryItem i : m.getValue()) {

                    writer.write(i.toString());
                    writer.newLine();

                }

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
