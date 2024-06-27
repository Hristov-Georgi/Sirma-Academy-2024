package inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl;

import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.ShoppingCart;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class ShoppingCartData implements ShoppingCart {
    private static final String ORDERS_DIRECTORY_PATH = "src/inheritanceAndInterfaces/inventoryManagementSystem/resources/orders/";

    private List<CartItem> shoppingCart;

    public ShoppingCartData() {
        this.shoppingCart = new ArrayList<>();
    }

    @Override
    public CartItem removeItemFromCart(int id) {

        for (CartItem i : this.shoppingCart) {

            if (i.getId() == id) {
                shoppingCart.remove(i);
                return i;
            }

        }

        throw new NullPointerException("Cart does not contain item with id: " + id);

    }

    @Override
    public CartItem addItemToCart(Map<Integer, InventoryItem> inventoryStorageMap, int id, double requiredQuantity) {

        InventoryItem currentItem = inventoryStorageMap.get(id);

        if (currentItem == null) {
            throw new NullPointerException("Invalid id number. Please check id and enter again.");
        }

        double currentItemQuantity = currentItem.getQuantity();

        if (currentItemQuantity >= requiredQuantity && currentItemQuantity > 0) {

            inventoryStorageMap.get(id).setQuantity(currentItemQuantity - requiredQuantity);

            BigDecimal totalPrice = currentItem.getPrice().multiply(BigDecimal.valueOf(requiredQuantity));

            CartItem item = new CartItem(currentItem.getId(),
                                        totalPrice,
                                        currentItem.getName(),
                                        requiredQuantity);

            this.shoppingCart.add(item);

            return item;

        } else {

            throw new NumberFormatException("Insufficient item quantity");

        }

    }

    @Override
    public List<CartItem> getCartItems() {

        if (this.shoppingCart.isEmpty()) {

            throw new NullPointerException("Your cart is empty.");

        } else {

            return this.shoppingCart;
        }
        
    }

    @Override
    public long placeOrder() {

        // save current order in file. And every next orders in different files.

        if (!this.shoppingCart.isEmpty()) {

            long orderNumber = getOrderNumber();

            String path = ORDERS_DIRECTORY_PATH + orderNumber + ".txt";

            File order = new File(path);

            if (order.exists()) {
                placeOrder();

            }


            try (BufferedWriter writer = new BufferedWriter(new FileWriter(order))) {

                for (CartItem item : this.shoppingCart) {
                    writer.write("Id | Total Price | Name | Quantity");
                    writer.write("----------------------------------");
                    writer.write(item.toString());
                    writer.newLine();
                }

            } catch (IOException ex) {

                System.out.println("Order unsuccessful. Please contact to customer service center.");

            }


            return orderNumber;

        } else {
            throw new NullPointerException("Your shopping cart is empty. Add products to make an order.");
        }

    }

    @Override
    public void printCartItems() {
        System.out.println("Id | Total Price | Name | Quantity");
        System.out.println("----------------------------------");
        this.shoppingCart.forEach(System.out::println);
    }

    @Override
    public void clearCart() {
        this.shoppingCart.clear();
    }

    private long getOrderNumber() {

        Random rnd = new Random();
        return rnd.nextLong(1);
    }

}
