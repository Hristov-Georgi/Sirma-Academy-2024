package inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl;

import inheritanceAndInterfaces.inventoryManagementSystem.enums.Category;

public class ElectronicItem extends InventoryItem {

    private double weight;

    public ElectronicItem(int id, double quantity, Category category, double price, double weight) {
        super(id, quantity, category, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


}
