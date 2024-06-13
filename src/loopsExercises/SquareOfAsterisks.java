package loopsExercises;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        for (int row = 1; row <= number; row++) {

            for (int col = 1; col <= number ; col++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
