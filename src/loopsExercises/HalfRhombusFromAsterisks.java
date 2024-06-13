package loopsExercises;

import java.util.Scanner;

public class HalfRhombusFromAsterisks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        for (int row = 1; row <= number; row++) {

            for (int col = 1; col <= row; col++) {

                System.out.print("* ");
            }

            System.out.println();

        }

        for (int reversedRow = number - 1; reversedRow >= 1 ; reversedRow--) {

            for (int reversedCol = reversedRow; reversedCol >= 1; reversedCol--) {

                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
