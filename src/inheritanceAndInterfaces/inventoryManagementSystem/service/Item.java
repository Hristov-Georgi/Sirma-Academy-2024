package inheritanceAndInterfaces.inventoryManagementSystem.service;

import java.math.BigDecimal;

public interface Item {

    String getItemDetails();
    BigDecimal calculateValue();
    String getItemDescription();

}
