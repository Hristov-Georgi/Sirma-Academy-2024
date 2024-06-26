package inheritanceAndInterfaces.inventoryManagementSystem;

import inheritanceAndInterfaces.inventoryManagementSystem.dataManipulation.Data;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.ElectronicItem;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.GroceryItem;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.InventoryItem;

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
        Map<Integer, List<InventoryItem>> inventoryStorageMap = Data.loadItems(wrongDataFormat, expiredProductsList);


        InventoryItem item = new GroceryItem("grocery", 10.54, 11113, 100, "23.02.2027");
        boolean is  = item.isBreakable();

        InventoryItem item1 = new ElectronicItem("electronic", 454.45, 22223, 10, 500);
        boolean isNot = item1.isBreakable();


    }


}
