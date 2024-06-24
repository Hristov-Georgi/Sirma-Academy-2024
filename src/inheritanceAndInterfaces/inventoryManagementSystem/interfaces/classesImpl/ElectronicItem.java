package inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl;

import inheritanceAndInterfaces.inventoryManagementSystem.enums.Category;

public class ElectronicItem extends InventoryItem {

    private double weight;

    public ElectronicItem(String category, double price, int id, double quantity, double weight) {
        super(category, price, id, quantity);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


}
