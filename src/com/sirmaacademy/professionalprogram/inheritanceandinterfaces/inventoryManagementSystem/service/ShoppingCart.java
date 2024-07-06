package com.sirmaacademy.professionalprogram.inheritanceandinterfaces.inventoryManagementSystem.service;

import com.sirmaacademy.professionalprogram.inheritanceandinterfaces.inventoryManagementSystem.service.implementation.CartItem;
import com.sirmaacademy.professionalprogram.inheritanceandinterfaces.inventoryManagementSystem.service.implementation.InventoryItem;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface ShoppingCart {

    CartItem removeItemFromCart(int id);

    CartItem addItemToCart(Map<Integer, InventoryItem> inventoryStorageMap, int id, double requiredQuantity);

    List<CartItem> getCartItems();

    long placeOrder(Card card);

    void printOrderedItems();

    void clearCart();

    BigDecimal getTotalCost();


}
