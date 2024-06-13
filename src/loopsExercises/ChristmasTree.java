package loopsExercises;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        if (1 <= n && n <= 100) {

            for (int row = 0; row <= n ; row++) {

                if (row == 0) {
                    printEmptySpace(n, row);
                    printPipe();

                } else {
                    printEmptySpace(n, row);
                    printAsterisk(row);
                    printPipe();
                    printAsterisk(row);

                }

                System.out.println();

            }


        }
    }

    private static void printAsterisk(int row) {

        for (int asteriskRow = 1; asteriskRow <= row ; asteriskRow++) {

            System.out.print("*");
        }

    }

    private static void printPipe() {
        System.out.print(" | ");
    }

    private static void printEmptySpace(int n, int row) {

        for (int emptySpace = n; emptySpace >= row + 1; emptySpace--) {
            System.out.print(" ");

        }

    }

}
