package loopsExercises;

import java.util.Scanner;

public class LeftArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int rows = n - 1;

        for (int row = 1; row <= rows; row++) {

            for (int emptySpace = 1; emptySpace <= rows - row; emptySpace++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {

                System.out.print("*");
            }

            System.out.println();
        }

        for (int reverseRow = rows - 1; reverseRow >= 1; reverseRow--) {

            for (int space = rows - reverseRow; space >= 1; space--) {
                System.out.print(" ");
            }

            for (int reverseCol = reverseRow; reverseCol >= 1; reverseCol--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}

