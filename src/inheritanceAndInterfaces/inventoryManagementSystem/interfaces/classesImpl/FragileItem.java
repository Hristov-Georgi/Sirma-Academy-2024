package inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl;

public class FragileItem extends InventoryItem {

    private double weight;

    public FragileItem(String category, double price, int id, double quantity, double weight) {
        super(category, price, id, quantity);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


}
