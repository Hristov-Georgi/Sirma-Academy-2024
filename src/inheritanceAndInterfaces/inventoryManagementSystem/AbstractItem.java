package inheritanceAndInterfaces.inventoryManagementSystem;

import inheritanceAndInterfaces.inventoryManagementSystem.interfaces.*;

import java.awt.*;
import java.math.BigDecimal;

public abstract class AbstractItem implements Item, Breakable, Categorizable, Perishable, Sellable {

    @Override
    public String getDetails() {
        return "";
    }

    @Override
    public BigDecimal calculateValue() {
        return null;
    }

    @Override
    public String getItemDescription() {
        return "";
    }

    @Override
    public boolean isBreakable() {
        return false;
    }

    @Override
    public void handlingBreakage() {

    }

    @Override
    public String getCategory() {
        return "";
    }

    @Override
    public String setCategory() {
        return "";
    }

    @Override
    public boolean isPerishable() {
        return false;
    }

    @Override
    public void handleExpiration() {

    }

    @Override
    public BigDecimal getPrice() {
        return null;
    }

    @Override
    public BigDecimal setPrice() {
        return null;
    }
}
