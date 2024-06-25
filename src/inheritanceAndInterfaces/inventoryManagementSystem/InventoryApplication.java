package inheritanceAndInterfaces.inventoryManagementSystem;

import inheritanceAndInterfaces.inventoryManagementSystem.dataManipulation.Data;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.InventoryItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InventoryApplication {

    public static void main(String[] args) {

        List<String> wrongDataFormat = new ArrayList<>();
        List<InventoryItem> expiredProductsList = new ArrayList<>();
        Map<Integer, List<InventoryItem>> inventoryStorageMap = Data.loadItems(wrongDataFormat, expiredProductsList);

        // write inventoryStorageMap values into the itemsData.txt after finish work.
        // sout wrongData in console
        // sout expired products


        System.out.println();
    }


}
