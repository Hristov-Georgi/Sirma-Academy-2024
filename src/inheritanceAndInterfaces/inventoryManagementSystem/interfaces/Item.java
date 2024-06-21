package inheritanceAndInterfaces.inventoryManagementSystem.interfaces;

import java.math.BigDecimal;

public interface Item {

    String getDetails();
    BigDecimal calculateValue();
    String getItemDescription();

}
