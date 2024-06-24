package inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl;

import inheritanceAndInterfaces.inventoryManagementSystem.enums.Category;

import java.time.LocalDate;

public class GroceryItem extends InventoryItem {

    private LocalDate expirationDate;

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public GroceryItem(int id, double quantity, Category category, double price, LocalDate expirationDate) {
        super(id, quantity, category, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean isExpired() {

        if (isPerishable() && expirationDate.isAfter(LocalDate.now())) {
            return true;
        }

        return false;

    }

}
