package inheritanceAndInterfaces.inventoryManagementSystem.service.implementation;

import inheritanceAndInterfaces.inventoryManagementSystem.configuration.FormatSeparators;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * This class is used when add items in the cart. Creates object with necessary variables needed to make an order.
 */
public class CartItem {

    private int id;
    private BigDecimal totalPrice;
    private String name;
    private double quantity;

    public CartItem(int id, BigDecimal totalPrice, String name, double quantity) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {

        DecimalFormat df = FormatSeparators.dotSeparatorTwoSignAfter();

        return String.format("%d, %s, %s, %s",
                this.id,
                df.format(this.totalPrice),
                this.name,
                df.format(this.quantity));

    }

}
