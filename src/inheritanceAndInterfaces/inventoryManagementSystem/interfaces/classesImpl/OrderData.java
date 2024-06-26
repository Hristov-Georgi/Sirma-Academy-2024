package inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl;

import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderData implements Order {

    private List<InventoryItem> itemCart;

    public OrderData() {
        this.itemCart = new ArrayList<>();
    }

    public List<InventoryItem> getItemCart() {
        return Collections.unmodifiableList(this.itemCart);
    }

    @Override
    public void removeItem(int id) {

    }

    @Override
    public void addItem(int id, double quantity) {

    }

    @Override
    public List<InventoryItem> displayCartItems() {
        return List.of();
    }

    @Override
    public List<InventoryItem> categorizeByName() {
        return List.of();
    }

    @Override
    public void placeOrder() {

    }

}
