package entryCourseLogicalExercises.loopsExercises;

import java.util.Scanner;

public class TreePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        if (n > 0) {

            int secondLoopIterations = 1;
            for (int row = 1; row <= n; row++) {

                for (int emptySpace = n - 1; emptySpace >= row ; emptySpace--) {
                    System.out.print(" ");
                }

                for (int col = 1; col <= secondLoopIterations ; col++) {

                    System.out.print("*");

                }

                secondLoopIterations += 2;

                System.out.println();

                if (row == n) {

                    for (int space = 1; space <= n - 1 ; space++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }

            }
        }
    }
}
