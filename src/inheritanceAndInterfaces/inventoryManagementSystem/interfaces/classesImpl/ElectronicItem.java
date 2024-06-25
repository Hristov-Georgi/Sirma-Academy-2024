package inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * This class creates electronic objects.
 * It may be used to create TV, dvd, smartphones etc.
 * All electronic items are considered as fragile.
 */

public class ElectronicItem extends FragileItem{

    public ElectronicItem(String category, double price, int id, double quantity, double weight) {
        super(category, price, id, quantity, weight);
    }

    @Override
    public String toString() {
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("0.##", dfs);

        return String.format("%s, %s, %d, %s, %s",
                super.getCategory(),
                df.format(super.getPrice()),
                super.getId(),
                df.format(super.getQuantity()),
                super.getWeight());
    }


}
