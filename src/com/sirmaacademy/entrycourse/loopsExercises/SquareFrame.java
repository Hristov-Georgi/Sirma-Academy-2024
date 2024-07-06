package com.sirmaacademy.entrycourse.loopsExercises;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n ; col++) {

                if (col == 1 && row == 1 ||
                    row == n && col == 1 ||
                    row == 1 && col == n ||
                    row == n && col == n) {

                    System.out.print("+ ");

                } else if (col != 1 && col != n) {

                    System.out.print("- ");

                } else {

                    System.out.print("| ");

                }

            }

            System.out.println();

        }
    }
}
