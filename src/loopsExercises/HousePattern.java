package loopsExercises;

import java.util.Scanner;

public class HousePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        /*
        В условието на задачата изхода със стойност 7 е без празно място между звездичките.
        Мисля, че е сгрешено, защото на останалите два примера с четно и нечетно число
        има празно място между тях.

        */

        int secondLoopIterations;

        if (n % 2 == 0) {
            secondLoopIterations = 2;
        } else {
            secondLoopIterations = 1;
        }

        for (int row = 1; row <= n; row++) {

            for (int emptySpace = n - secondLoopIterations; emptySpace > 0; emptySpace--) {
                System.out.print(" ");
            }

            for (int col = 1; col <= secondLoopIterations; col++) {
                System.out.print("* ");

            }

            System.out.println();

            if (secondLoopIterations == n) {
                break;
            }

            secondLoopIterations += 2;

        }

        int groundingColumns = 2 * secondLoopIterations - 1;

        for (int groundingRow = 1; groundingRow <= 2; groundingRow++) {

            for (int groundingCol = 1; groundingCol <= groundingColumns; groundingCol++) {

                if (groundingCol == 1 || groundingCol == groundingColumns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }

    }

}
