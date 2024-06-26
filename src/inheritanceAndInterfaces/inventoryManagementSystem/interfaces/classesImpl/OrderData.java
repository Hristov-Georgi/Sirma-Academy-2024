package inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl;

import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class OrderData implements Order {
    private static final String ORDERS_DIRECTORY_PATH = "src/inheritanceAndInterfaces/inventoryManagementSystem/resources/orders/";

    private List<CartItem> itemsCart;

    public OrderData() {
        this.itemsCart = new ArrayList<>();
    }

    @Override
    public void removeItemFromCart(int id) {

        for (CartItem i : this.itemsCart) {

            if (i.getId() == id) {
                itemsCart.remove(i);
            }

        }

    }

    @Override
    public void addItemToCart(Map<Integer, InventoryItem> inventoryStorageMap, int id, double requiredQuantity) {

        InventoryItem currentItem = inventoryStorageMap.get(id);
        double currentItemQuantity = currentItem.getQuantity();

        if (currentItemQuantity >= requiredQuantity && currentItemQuantity > 0) {
            currentItem.setQuantity(requiredQuantity);

            inventoryStorageMap.get(id).setQuantity(currentItemQuantity - requiredQuantity);

            BigDecimal totalPrice = currentItem.getPrice().multiply(BigDecimal.valueOf(requiredQuantity));

            itemsCart.add(new CartItem(currentItem.getId(),
                                        totalPrice,
                                        currentItem.getName(),
                                        currentItem.getQuantity()));
        } else {

            throw new IllegalArgumentException("Insufficient item quantity");

        }

    }

    @Override
    public List<CartItem> getCartItems() {

        if (this.itemsCart.isEmpty()) {

            throw new NullPointerException("Your cart is empty.");

        } else {

            return this.itemsCart;
        }


    }

    @Override
    public List<CartItem> categorizeCartItemsByName() {

        if (this.itemsCart.isEmpty()) {

            throw new NullPointerException("Your cart is empty.");

        } else {

            this.itemsCart.sort(Comparator.comparing(CartItem::getName));

            return this.itemsCart;
        }

    }

    @Override
    public void placeOrder() {

        // save current order in file. And every next orders in different files.

        File order = getNewOrderFile();

        if (order.exists()) {
            order = getNewOrderFile();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(order))) {

            for (CartItem item : this.itemsCart) {

                writer.write(item.toString());
                writer.newLine();

            }

        } catch (IOException ex) {

            System.out.println("Order unsuccessful. Please contact to customer service center.");

        }

    }

    private File getNewOrderFile() {

        Random rnd = new Random();
        long orderNumber = rnd.nextLong();

        String path = ORDERS_DIRECTORY_PATH + orderNumber + ".txt";

        return new File(path);
    }

}
