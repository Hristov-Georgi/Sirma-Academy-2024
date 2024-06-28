package inheritanceAndInterfaces.inventoryManagementSystem.service.implementation;

import java.math.BigDecimal;

/**
 * Provides common method implementation for it's subclasses.
 */

public class InventoryItem extends AbstractItem {

    private int id;
    private double quantity;

    public InventoryItem(int id, String category, double price, String name, double quantity) {
        super(category, price, name);
        this.id = id;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public BigDecimal calculateValue() {
        return BigDecimal.valueOf(this.quantity).multiply(super.getPrice());
    }

    @Override
    public boolean isExpired() {
        return false;
    }

}
