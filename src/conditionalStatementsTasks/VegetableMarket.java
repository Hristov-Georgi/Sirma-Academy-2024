package conditionalStatementsTasks;

import java.util.List;
import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        final List<String> daysOfWeekList = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        final List<String> weekDaysList = List.of("Saturday", "Sunday");
        final List<String> vegetableList = List.of("tomato", "onion", "pepper", "lettuce", "cucumber");

        Scanner sc = new Scanner(System.in);

        String productName = sc.nextLine();
        String day = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());

        double productTotalPrice;

        if (!vegetableList.contains(productName) ||
                !daysOfWeekList.contains(day) ||
                (quantity <= 0)) {
            System.out.println("Error");
            return;

        } else if (weekDaysList.contains(day)) {
                productTotalPrice = quantity * weekDaysPrices(productName);

        } else {
                productTotalPrice = quantity * workDaysPrices(productName);
        }

        System.out.printf("%.2f", productTotalPrice);

    }

    private static double workDaysPrices(String productName) {
        double price = 0.0;

        switch (productName) {
            case "tomato":
                price = 2.50;
                break;
            case "onion":
                price = 1.20;
                break;
            case "lettuce":
                price = 0.85;
                break;
            case "cucumber":
                price = 1.45;
                break;
            case "pepper":
                price = 5.50;
                break;
        }

        return price;

    }

    private static double weekDaysPrices(String productName) {
        double price = 0.0;

        switch (productName) {
            case "tomato":
                price = 2.80;
                break;
            case "onion":
                price = 1.30;
                break;
            case "lettuce":
                price = 0.85;
                break;
            case "cucumber":
                price = 1.75;
                break;
            case "pepper":
                price = 3.50;
                break;
        }

        return price;

    }
}
