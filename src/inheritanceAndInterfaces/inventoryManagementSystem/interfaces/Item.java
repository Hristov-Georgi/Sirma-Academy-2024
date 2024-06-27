package inheritanceAndInterfaces.inventoryManagementSystem.interfaces;

import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.classesImpl.InventoryItem;

import java.math.BigDecimal;
import java.util.Map;

public interface Item {

    String getItemDetails();
    BigDecimal calculateValue();
    String getItemDescription();

}
