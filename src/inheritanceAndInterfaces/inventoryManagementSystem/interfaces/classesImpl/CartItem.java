package inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl;

import inheritanceAndInterfaces.inventoryManagementSystem.dataManipulation.FormatSeparators;

import java.math.BigDecimal;
import java.text.DecimalFormat;

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
