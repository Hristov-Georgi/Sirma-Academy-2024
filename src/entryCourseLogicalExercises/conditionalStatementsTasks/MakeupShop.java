package entryCourseLogicalExercises.conditionalStatementsTasks;

import java.util.Scanner;

public class MakeupShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double renovationPrice = Double.parseDouble(sc.nextLine());
        int powdersCount = Integer.parseInt(sc.nextLine());
        int lipsticksCount = Integer.parseInt(sc.nextLine());
        int spiralsCount = Integer.parseInt(sc.nextLine());
        int shadowsCount = Integer.parseInt(sc.nextLine());
        int correctorsCount = Integer.parseInt(sc.nextLine());

        boolean inputValidation = validateInput(renovationPrice, powdersCount, lipsticksCount, spiralsCount, shadowsCount, correctorsCount);
        if (!inputValidation) {
            System.out.println("Invalid input");
            return;
        }

        int totalProducts = totalProductsCount(powdersCount, lipsticksCount, spiralsCount, shadowsCount, correctorsCount);

        double finalProfit;
        if(totalProducts >= 50) {
            double discountIndex = 0.75; // 25% shop discount
            finalProfit = totalProfitWithoutRent(powdersCount, lipsticksCount, spiralsCount, shadowsCount, correctorsCount) * discountIndex;
        } else {
            finalProfit = totalProfitWithoutRent(powdersCount, lipsticksCount, spiralsCount, shadowsCount, correctorsCount);
        }

        if (finalProfit >= renovationPrice) {
            System.out.printf("Yes! %.2f lv left.", finalProfit - renovationPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", renovationPrice - finalProfit);
        }

    }

    private static double totalProfitWithoutRent(int powdersCount, int lipstickCount, int spiralsCount,
                                                 int shadowsCount, int correctorCount) {
        double rentIndex = 0.9; // shop rent is 10%
        double profit = (powdersCount * 2.60) +
                (lipstickCount * 3) +
                (spiralsCount * 4.10) +
                (shadowsCount * 8.20) +
                (correctorCount * 2);

        return profit * rentIndex;

    }

    private static int totalProductsCount(int powdersCount, int lipstickCount, int spiralsCount,
                                          int shadowsCount, int correctorCount) {
        return powdersCount + lipstickCount + spiralsCount + shadowsCount + correctorCount;
    }

    private static boolean validateInput(double renovationPrice, int powdersCount,
                                         int lipstickCount, int spiralsCount, int shadowsCount,
                                         int correctorCount) {

        return renovationPrice >= 1.0 && renovationPrice <= 10000.00 &&
                powdersCount >= 0 && powdersCount <= 1000 &&
                lipstickCount >= 0 && lipstickCount <= 1000 &&
                spiralsCount >= 0 && spiralsCount <= 1000 &&
                shadowsCount >= 0 && shadowsCount <= 1000 &&
                correctorCount >= 0 && correctorCount <= 1000;

    }
}
