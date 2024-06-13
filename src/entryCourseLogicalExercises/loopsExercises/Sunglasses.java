package entryCourseLogicalExercises.loopsExercises;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int colSize = n * 5;
        int colEmptySpaceLowerBound = (colSize - n) / 2;
        int colEmptySpaceUpperBound = ((colSize -n ) / 2) + n;

        if (3 <= n && n <= 100) {

            for (int row = 1; row <= n ; row++) {

                for (int col = 1; col <= colSize; col++) {

                    if (col > colEmptySpaceLowerBound && col <= colEmptySpaceUpperBound ) {

                        if (n % 2 == 0 && row == n / 2) {
                            System.out.print("|");
                        } else if (n % 2 != 0 && row == n / 2 + 1) {
                            System.out.print("|");
                        } else {
                            System.out.print(" ");
                        }

                    } else {

                        if (row == 1 ||
                                row == n ||
                                col == 1 ||
                                col == colSize ||
                                col == colEmptySpaceLowerBound ||
                                col == colEmptySpaceUpperBound + 1) {

                            System.out.print("*");

                        } else {

                            System.out.print("/");

                        }

                    }

                }

                System.out.println();

            }

        }

    }

}
