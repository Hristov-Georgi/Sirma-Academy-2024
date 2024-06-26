package inheritanceAndInterfaces.inventoryManagementSystem.interfaces;

import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.CartItem;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.InventoryItem;

import java.util.List;
import java.util.Map;

public interface Order {

    void removeItemFromCart(int id);

    void addItemToCart(Map<Integer, InventoryItem> inventoryStorageMap, int id, double requiredQuantity);

    List<CartItem> getCartItems();

    void placeOrder();

}
