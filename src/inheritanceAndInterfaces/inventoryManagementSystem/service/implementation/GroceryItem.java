package inheritanceAndInterfaces.inventoryManagementSystem.service.implementation;

import inheritanceAndInterfaces.inventoryManagementSystem.configuration.FormatSeparators;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

/**
 * This class is used to create objects of groceries (food products).
 * It overrides isExpired method that check if current product is expired.
 * Expiration date is formatted to European (Bulgarian) most used data format, which is used in itemsData.txt file.
 */

public class GroceryItem extends InventoryItem {
    DateTimeFormatter EUROPEAN_DATE_FORMAT = new DateTimeFormatterBuilder()
            .appendValue(ChronoField.DAY_OF_MONTH, 2)
            .appendLiteral('.')
            .appendValue(ChronoField.MONTH_OF_YEAR, 2)
            .appendLiteral('.')
            .appendValue(ChronoField.YEAR, 4)
            .toFormatter();

    private LocalDate expirationDate;

    public String getExpirationDate() {
        return this.expirationDate.format(EUROPEAN_DATE_FORMAT);
    }

    public GroceryItem(int id, String category, double price, String name, double quantity, String expirationDate) {
        super(id, category, price, name, quantity);
        this.expirationDate = LocalDate.parse(expirationDate, EUROPEAN_DATE_FORMAT);
    }

    @Override
    public boolean isExpired() {

        if (isPerishable() && expirationDate.isBefore(LocalDate.now())) {
            return true;
        }

        return false;

    }

    @Override
    public String toString() {

        DecimalFormat df = FormatSeparators.dotSeparatorTwoSignAfter();

        return String.format("%d, %s, %s, %s, %s, %s",
                super.getId(),
                super.getCategory(),
                df.format(super.getPrice()),
                super.getName(),
                df.format(super.getQuantity()),
                this.getExpirationDate());
    }

}
