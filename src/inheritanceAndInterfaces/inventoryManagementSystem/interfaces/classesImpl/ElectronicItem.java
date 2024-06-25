package inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl;

/**
 * This class creates electronic objects.
 * It may be used to create TV, dvd, smartphones etc.
 * All electronic items are considered as fragile.
 */

public class ElectronicItem extends FragileItem{

    public ElectronicItem(String category, double price, int id, double quantity, double weight) {
        super(category, price, id, quantity, weight);
    }


}
