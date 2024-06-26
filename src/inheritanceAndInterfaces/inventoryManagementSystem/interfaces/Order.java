package inheritanceAndInterfaces.inventoryManagementSystem.interfaces;

import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.InventoryItem;

import java.util.List;

public interface Order {

    void removeItem(int id);

    void addItem(int id, double quantity);

    List<InventoryItem> displayCartItems();

    List<InventoryItem> categorizeByName();

    void placeOrder();

}
