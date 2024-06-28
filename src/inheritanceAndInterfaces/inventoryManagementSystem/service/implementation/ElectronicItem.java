package inheritanceAndInterfaces.inventoryManagementSystem.service.implementation;

import inheritanceAndInterfaces.inventoryManagementSystem.configuration.FormatSeparators;

import java.text.DecimalFormat;

/**
 * This class creates electronic objects.
 * It may be used to create TV, dvd, smartphones etc.
 * All electronic items are considered as fragile.
 */

public class ElectronicItem extends FragileItem{

    public ElectronicItem(int id, String category, double price, String name, double quantity, double weight) {
        super(id, category, price, name, quantity, weight);
    }

    @Override
    public String toString() {

        DecimalFormat df = FormatSeparators.dotSeparatorTwoSignAfter();

        return String.format("%d, %s, %s, %s, %s",
                super.getId(),
                super.getCategory(),
                df.format(super.getPrice()),
                super.getName(),
                df.format(super.getQuantity()),
                super.getWeight());
    }


}
