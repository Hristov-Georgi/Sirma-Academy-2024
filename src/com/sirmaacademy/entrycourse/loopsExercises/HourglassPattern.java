package com.sirmaacademy.entrycourse.loopsExercises;

import java.util.Scanner;

public class HourglassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        firstLastRow(number);

        int rowIterations;
        if (number % 2 == 0) {
            rowIterations = number / 2;
        } else {
            rowIterations = number / 2 + 1;
        }

        for (int row = 1; row <= rowIterations ; row++) {

            for (int col = 1; col <= number + 2; col++) {

                if (row + 1 == col || number + 2 - row == col) {

                    System.out.print("#");

                } else {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        for (int row = rowIterations; row > 1 ; row--) {

            for (int col = number + 2; col > 1; col--) {

                if (row  == col || number + 3 - row == col) {

                    System.out.print("#");

                } else {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        firstLastRow(number);

    }

    private static void firstLastRow(int number) {

        for (int startRow = 1; startRow == 1; startRow++) {

            for (int cols = 1; cols <= number + 2; cols++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
