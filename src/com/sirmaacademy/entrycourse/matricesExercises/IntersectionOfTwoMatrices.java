package com.sirmaacademy.entrycourse.matricesExercises;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int rowsNum = Integer.parseInt(sc.nextLine());
        int colsNum = Integer.parseInt(sc.nextLine());

        char[][] matrixA = new char[rowsNum][colsNum];
        fillMatrix(rowsNum, colsNum, matrixA);

        char[][] matrixB = new char[rowsNum][colsNum];
        fillMatrix(rowsNum, colsNum, matrixB);

        printIntersectionResult(matrixA, matrixB);

    }

    /* Compares elements first and second matrix and prints result.
    * If elements are not equal  print '*' else print current element.
    * */

    private static void printIntersectionResult(char[][] firstMatrix, char[][] secondMatrix) {

        for (int row = 0; row < firstMatrix.length; row++) {

            for (int col = 0; col < firstMatrix[row].length; col++) {

                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    System.out.print("* ");
                } else {
                    System.out.print(firstMatrix[row][col] + " ");
                }

            }

            System.out.println();

        }
    }

    private static void fillMatrix(int rows, int cols, char[][] matrix) {

        for (int row = 0; row < rows; row++) {

            String[] chars = sc.nextLine().split("\\s+");

            for (int col = 0; col < cols; col++) {

                matrix[row][col] = chars[col].charAt(0);
            }

        }

    }

}
