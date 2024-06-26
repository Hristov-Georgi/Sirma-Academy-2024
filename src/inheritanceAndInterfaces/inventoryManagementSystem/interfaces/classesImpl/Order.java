package inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl;

import java.util.List;

public class Order {

    private List<InventoryItem> items;

    public List<InventoryItem> getItems() {
        return items;
    }

    public void setItems(List<InventoryItem> items) {
        this.items = items;
    }
}
