package inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl;

/**
 * This FragileItem class should be inherited from all classes that creates fragile objects.
 */

public class FragileItem extends InventoryItem {

    private double weight;

    public FragileItem(String category, double price, String name, int id, double quantity, double weight) {
        super(category, price, name, id, quantity);
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean isBreakable() {
        return true;
    }
}
