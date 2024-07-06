package com.sirmaacademy.entrycourse.methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxRows = Integer.parseInt(sc.nextLine());

        printTriangleAscOrder(maxRows);
        printTriangleDescOrder(maxRows);


    }

    private static void printTriangleAscOrder(int rows) {

        for (int row = 1; row <= rows ; row++) {

            for (int col = 1; col <= row ; col++) {

                System.out.print(col);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    private static void printTriangleDescOrder(int rows) {

        for (int row = rows - 1; row >= 1 ; row--) {

            for (int col = row; col >= 1 ; col--) {

                System.out.print(col);
                System.out.print(" ");
            }

            System.out.println();
        }

    }
    
}
