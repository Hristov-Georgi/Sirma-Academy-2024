package inheritanceAndInterfaces.inventoryManagementSystem.service;

import inheritanceAndInterfaces.inventoryManagementSystem.service.implementation.CartItem;
import inheritanceAndInterfaces.inventoryManagementSystem.service.implementation.InventoryItem;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface ShoppingCart {

    CartItem removeItemFromCart(int id);

    CartItem addItemToCart(Map<Integer, InventoryItem> inventoryStorageMap, int id, double requiredQuantity);

    List<CartItem> getCartItems();

    long placeOrder();

    void printOrderedItems();

    void clearCart();

    BigDecimal getTotalCost();

}
