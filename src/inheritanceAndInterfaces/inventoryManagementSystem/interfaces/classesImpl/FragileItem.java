package inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl;

/**
 * This FragileItem class should be inherited from all classes that creates fragile objects.
 */

public class FragileItem extends InventoryItem {

    private double weight;

    public FragileItem(int id, String category, double price, String name, double quantity, double weight) {
        super(id, category, price, name, quantity);
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
