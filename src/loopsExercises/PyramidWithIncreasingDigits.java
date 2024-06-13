package loopsExercises;

import java.util.Scanner;

public class PyramidWithIncreasingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        if (n > 0) {

            int secondLoopIterations = 1;

            for (int row = 0; row < n; row++) {

                for (int emptySpace = n - 1; emptySpace >= row + 1; emptySpace--) {
                    System.out.print(" ");
                }

                int number = row;
                for (int ascCol = 1; ascCol <= secondLoopIterations / 2 + 1; ascCol++) {

                    System.out.print(++number);

                }

                for (int descCow = secondLoopIterations / 2; descCow >= 1; descCow--) {
                    System.out.print(--number);
                }

                secondLoopIterations += 2;

                System.out.println();
            }

        }

    }

}
