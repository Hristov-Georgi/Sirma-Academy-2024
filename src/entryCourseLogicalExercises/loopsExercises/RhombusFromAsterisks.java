package entryCourseLogicalExercises.loopsExercises;

import java.util.Scanner;

public class RhombusFromAsterisks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        for (int row = 1; row <= number; row++) {

            for (int emptySpace = number - 1; emptySpace >= row ; emptySpace--) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {

                System.out.print("* ");
            }

            System.out.println();

        }

        for (int revRow = number - 1; revRow >= 1 ; revRow--) {

            for (int emptySpace = revRow; emptySpace < number ; emptySpace++) {
                System.out.print(" ");
            }

            for (int revCol = revRow; revCol >= 1 ; revCol--) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
