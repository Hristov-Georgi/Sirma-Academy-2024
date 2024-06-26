package inheritanceAndInterfaces.inventoryManagementSystem.dataManipulation;

import inheritanceAndInterfaces.inventoryManagementSystem.enums.Category;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.ElectronicItem;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.FragileItem;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.GroceryItem;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.InventoryItem;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {

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
                    String category = singleData[0];
                    double price = Double.parseDouble(singleData[1]);
                    int id = Integer.parseInt(singleData[2]);
                    String name = singleData[3];

                    if (category.toUpperCase().equals(Category.GROCERY.name())) {
                        double quantity = Double.parseDouble(singleData[4]);
                        String expirationDate = singleData[5];

                        InventoryItem groceryItem = new GroceryItem(category, price, name, id, quantity, expirationDate);

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

                        double quantity = Double.parseDouble(singleData[3]);
                        double weight = Double.parseDouble(singleData[4]);

                        if (itemsMap.containsKey(id)) {
                            double currentItemQuantity = itemsMap.get(id).getQuantity();
                            double  currentItemWeight = ((FragileItem) itemsMap.get(id)).getWeight();

                            itemsMap.get(id).setQuantity(currentItemQuantity + quantity);
                            ((FragileItem) itemsMap.get(id)).setWeight(currentItemWeight + weight);
                        }

                        itemsMap.putIfAbsent(id, new ElectronicItem(category, price, name, id, quantity, weight));

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

}
