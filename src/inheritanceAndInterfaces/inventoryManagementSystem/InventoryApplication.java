package inheritanceAndInterfaces.inventoryManagementSystem;

import inheritanceAndInterfaces.inventoryManagementSystem.dataManipulation.InitialData;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.ShoppingCart;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.InventoryItem;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.ShoppingCartData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InventoryApplication {

    public static void main(String[] args) {

        /*
         * This list stores inventory items that have incorrect data or are entered in different format.
         * The information may be used to revise items data in storage file if needed.
         */
        List<String> wrongDataFormat = new ArrayList<>();

        /*
         * The list stores expired products and should be used for easier product handling if needed.
         */
        List<InventoryItem> expiredProductsList = new ArrayList<>();

        /*
         * Map stores all correctly entered and non expired products from data file.
         */
        Map<Integer, InventoryItem> inventoryStorageMap = InitialData.loadItems(wrongDataFormat, expiredProductsList);

        InitialData.printIndexPage(inventoryStorageMap);


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            ShoppingCart shoppingCart = new ShoppingCartData();

            String input = reader.readLine();

            while (input != null && !input.equals("exit")) {

                String[] command = input.split("\\s+");

                switch (command[0]) {

                    case "add":

                        try {
                            int idToRemove = Integer.parseInt(command[1]);
                            double quantity = Double.parseDouble(command[2]);

                            shoppingCart.addItemToCart(inventoryStorageMap, idToRemove, quantity);

                        } catch (NumberFormatException ex) {
                            System.out.println("Enter valid id number. Id should be five digits long.");

                        } catch (NullPointerException e) {
                            System.out.println(e.getMessage());
                        }

                        break;

                    case "sort":

                        if (command[1].equals("name")) {

                        } else if (command[1].equals("id")) {

                        } else if (command[1].equals("category")) {


                        } else if (command[1].equals("price")) {

                        }

                        continue;

                    case "remove":
                        try {
                            int idToRemove = Integer.parseInt(command[1]);


                        } catch (NumberFormatException ex) {
                            System.out.println("Enter valid id number. Id should be five digits long.");
                            continue;
                        }

                        break;

                    case "cart":


                        break;

                    case "order":


                        InitialData.writeItemsToFile(inventoryStorageMap);
                        break;

                    default:

                        System.out.println("Incorrect command!. Please check your input and make sure that every word is free space separated.");
                        break;

                }


                input = reader.readLine();
            }


        } catch (IOException ex) {

        }

    }


}
