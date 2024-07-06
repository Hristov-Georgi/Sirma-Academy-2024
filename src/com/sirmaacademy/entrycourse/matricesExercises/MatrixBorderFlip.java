package com.sirmaacademy.entrycourse.matricesExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixBorderFlip {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[][] matrix = fillMatrix(dimensions);

        flipElementsClockWise(matrix, dimensions);

        printMatrix(matrix);

    }

    private static void printMatrix(String[][] matrix) {

        for (String[] el : matrix) {
            System.out.println(String.join(" ", el));
        }
    }

    private static void flipElementsClockWise(String[][] matrix, int[] dimensions) {

        String element1 = matrix[0][0];
        String element2 = matrix[0][dimensions[0] - 1];
        String element3 = matrix[dimensions[0] - 1][dimensions[1] - 1];
        String element4 = matrix[dimensions[0] - 1][0];

        rotateFirstRowValues(matrix, dimensions[1]);
        rotateLastColumnValues(matrix, dimensions[0], dimensions[1] - 1);
        rotateLastRowValues(matrix, dimensions[0] - 1, dimensions[1]);
        rotateFirstColumnValues(matrix, dimensions[0]);

        matrix[0][1] = element1;
        matrix[1][dimensions[1] - 1] = element2;
        matrix[dimensions[0] - 1][dimensions[1] - 2] = element3;
        matrix[dimensions[0] - 2][0] = element4;
    }

    private static void rotateFirstRowValues(String[][] matrix, int cols) {

        for (int col = cols - 1; col > 0; col--) {

            matrix[0][col] = matrix[0][col - 1];

        }

    }

    private static void rotateLastRowValues(String[][] matrix, int lastRow, int cols) {

        for (int col = 0; col < cols - 1; col++) {

            matrix[lastRow][col] = matrix[lastRow][col + 1];
        }

    }

    private static void rotateLastColumnValues(String[][] matrix, int rows, int lastCol) {

        for (int row = rows - 1; row > 0; row--) {

            matrix[row][lastCol] = matrix[row - 1][lastCol];
        }

    }

    private static void rotateFirstColumnValues(String[][] matrix, int rows) {

        for (int row = 0; row < rows - 1; row++) {

            matrix[row][0] = matrix[row + 1][0];
        }

    }

    private static String[][] fillMatrix(int[] dimensions) {

        String[][] matrix = new String[dimensions[0]][dimensions[1]];

        for (int row = 0; row < dimensions[0]; row++) {

            matrix[row] = sc.nextLine().split("\\s+");

        }

        return matrix;

    }
}
