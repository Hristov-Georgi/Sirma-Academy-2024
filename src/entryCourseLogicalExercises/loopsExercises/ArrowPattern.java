package entryCourseLogicalExercises.loopsExercises;

import java.util.Scanner;

public class ArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        if (n > 0) {

            for (int row = 1; row <= n; row++) {

                for (int emptySpace = n - 1; emptySpace >= row ; emptySpace--) {
                    System.out.print(" ");
                }

                for (int col = 1; col <= row; col++) {

                    System.out.print("* ");
                }

                System.out.println();

            }


            int symbolCount;
            if (n < 3) {
                symbolCount = 1;
            } else if (n <= 5){
                symbolCount = 3;
            } else {
                symbolCount = 5;
            }

            for (int tailRow = 1; tailRow <= n; tailRow++) {

                for (int emptySpace = 0; emptySpace < (2 * n - 1 - symbolCount) / 2; emptySpace++) {
                    System.out.print(" ");
                }

                for (int tailCol = 1; tailCol <= symbolCount; tailCol++) {
                    System.out.print("*");
                }

                System.out.println();

            }




        }
    }
}
