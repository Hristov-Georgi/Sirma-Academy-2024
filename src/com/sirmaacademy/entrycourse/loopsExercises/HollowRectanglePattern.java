package com.sirmaacademy.entrycourse.loopsExercises;

import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = Math.abs(Integer.parseInt(sc.nextLine()));
        int columns = Math.abs(Integer.parseInt(sc.nextLine()));

        for (int row = 1; row <= rows ; row++) {

            for (int col = 1; col <= columns; col++) {

                if (row == 1 || row == rows || col == 1 || col == columns) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }

            System.out.println();

        }

    }
}
