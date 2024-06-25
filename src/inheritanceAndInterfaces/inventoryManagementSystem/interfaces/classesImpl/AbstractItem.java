package inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl;

import inheritanceAndInterfaces.inventoryManagementSystem.enums.Category;
import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.*;

import java.math.BigDecimal;


public abstract class AbstractItem implements Item, Breakable, Categorizable, Perishable, Sellable {

    private String description;
    private Category category;
    private String details;
    private BigDecimal price;

    public AbstractItem(String category, double price) {
        this.category = Category.valueOf(category.toUpperCase());
        this.setPrice(price);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String getItemDetails() {
        return this.details;
    }

    @Override
    public String getItemDescription() {
        return this.description;
    }

    @Override
    public String getCategory() {
        return this.category.name();
    }

    @Override
    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean isBreakable() {
        String categoryName = this.category.name();

        if (categoryName.equals("ELECTRONIC") || categoryName.equals("GLASS")) {
            return true;
        }

        return false;

    }

    @Override
    public void handlingBreakage() {

        if (isBreakable()) {
            System.out.println("FRAGILE! PLEASE HANDLE WITH CARE.");
        } else {
            System.out.println("Normal handling");
        }

    }

    @Override
    public void setPrice(double price) {
        this.price = BigDecimal.valueOf(price);
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

    @Override
    public boolean isPerishable() {

        if (this.category.name().equals("GROCERY")) {
            return true;
        }

        return false;
    }

}
