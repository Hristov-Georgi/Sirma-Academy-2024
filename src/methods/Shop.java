package methods;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String productName = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        printOrderTotalPrice(productName, quantity);
    }

    private static void printOrderTotalPrice(String productName, int quantity) {
        final double COFFEE_PRICE = 1.50;
        final double WATER_PRICE = 1.00;
        final double SNACKS_PRICE = 2.00;
        final double COKE_PRICE = 1.40;

        Double totalPrice = null;
        switch (productName) {

            case "coffee":
                totalPrice = calculateTotalPrice(quantity, COFFEE_PRICE);
                break;

            case "water":
                totalPrice = calculateTotalPrice(quantity, WATER_PRICE);
                break;

            case "snacks":
                totalPrice = calculateTotalPrice(quantity, SNACKS_PRICE);
                break;

            case "coke":
                totalPrice = calculateTotalPrice(quantity, COKE_PRICE);
                break;

        }

        if (totalPrice == null) {
            System.out.println("Check input values.");
        } else {
            System.out.printf("%.2f", totalPrice);
        }


    }

    private static double calculateTotalPrice(int quantity, double price) {
        return quantity * price;
    }

}
