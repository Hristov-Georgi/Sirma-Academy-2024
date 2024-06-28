package inheritanceAndInterfaces.inventoryManagementSystem.service;

import java.math.BigDecimal;

public interface Sellable {

    BigDecimal getPrice();
    void setPrice(double price);

}
