package inheritanceAndInterfaces.inventoryManagementSystem.dataManipulation;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Using this class to set custom decimal format symbols according customer requirements for data format.
 */

public class FormatSeparators {

    /**
     * Method set decimal format symbol to '.' (dot symbol).
     * Return decimal format with dot separator to two decimal signs after decimal point.
     */

    public static DecimalFormat dotSeparatorTwoSignAfter() {

        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        return new DecimalFormat("0.##", dfs);
    }
}
