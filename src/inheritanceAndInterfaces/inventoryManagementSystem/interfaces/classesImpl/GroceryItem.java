package inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class GroceryItem extends InventoryItem {
    DateTimeFormatter EUROPEAN_DATE_FORMAT = new DateTimeFormatterBuilder()
            .appendValue(ChronoField.DAY_OF_MONTH, 2)
            .appendLiteral('.')
            .appendValue(ChronoField.MONTH_OF_YEAR, 2)
            .appendLiteral('.')
            .appendValue(ChronoField.YEAR, 4)
            .toFormatter();

    private LocalDate expirationDate;

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public GroceryItem(String category, double price, int id, double quantity, String expirationDate) {
        super(category, price, id, quantity);
        this.expirationDate = LocalDate.parse(expirationDate, EUROPEAN_DATE_FORMAT);
    }

    @Override
    public boolean isExpired() {

        if (isPerishable() && expirationDate.isAfter(LocalDate.now())) {
            return true;
        }

        return false;

    }

}
