package inheritanceAndInterfaces.inventoryManagementSystem.service.implementation;

import inheritanceAndInterfaces.inventoryManagementSystem.service.ShoppingCart;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class ShoppingCartData implements ShoppingCart {
    private static final String ORDERS_DIRECTORY_PATH = "src/inheritanceAndInterfaces/inventoryManagementSystem/resources/orders/";

    private List<CartItem> shoppingCart;
    private PaymentProcessor paymentProcessor;

    public ShoppingCartData() {
        this.shoppingCart = new ArrayList<>();
    }

    /**
     * Removes and return the item from shopping cart by given id.
     * Throws NullPointerException if cart does not contain item with given id.
     */
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

    /**
     * Add new item to cart by id and quantity.
     * If id is valid and quantity is available adds item to the cart, else throw NullPointerException.
     * Updates available item quantities when product is added in shopping cart.
     * Return item if successfully added to cart.
     */
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

    /**
     * Return all items available in the shopping cart.
     * Throws NullPointerException if cart is empty.
     */
    @Override
    public List<CartItem> getCartItems() {

        if (this.shoppingCart.isEmpty()) {

            throw new NullPointerException("Your cart is empty.");

        } else {

            return this.shoppingCart;
        }

    }

    /**
     * Save every order in new file and return order number if operation is successful.
     * Throws NullPointerException if cart is empty.
     * Throws IOException if order is not saved successfully.
     */
    @Override
    public long placeOrder() {

        if (!this.shoppingCart.isEmpty()) {

            // PaymentProcessor implementation;

            long orderNumber = getOrderNumber();

            String path = ORDERS_DIRECTORY_PATH + orderNumber + ".txt";

            File order = new File(path);

            if (order.exists()) {
                placeOrder();

            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(order))) {

                writer.write("Id | Total Price | Name | Quantity");
                writer.newLine();
                writer.write("----------------------------------");
                writer.newLine();

                for (CartItem item : this.shoppingCart) {
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

    /**
     * Print ordered items on console after successful placed order.
     */
    @Override
    public void printOrderedItems() {
        System.out.println("Id | Total Price | Name | Quantity");
        System.out.println("----------------------------------");
        this.shoppingCart.forEach(System.out::println);
    }

    /**
     * Clear all items from shopping cart.
     */
    @Override
    public void clearCart() {
        this.shoppingCart.clear();
    }

    /**
     * Return order total cost.
     */
    @Override
    public BigDecimal getTotalCost() {
        BigDecimal totalValue = new BigDecimal(0);

        for (CartItem i : shoppingCart) {
            totalValue = totalValue.add(i.getTotalPrice());
        }

        return totalValue;
    }

    /**
     * Return unique order number.
     */
    private long getOrderNumber() {

        Random rnd = new Random();
        return rnd.nextLong(1, Long.MAX_VALUE);
    }

}
