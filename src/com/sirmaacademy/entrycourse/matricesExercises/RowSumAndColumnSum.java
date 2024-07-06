package com.sirmaacademy.entrycourse.matricesExercises;

import java.util.Arrays;
import java.util.Scanner;

public class RowSumAndColumnSum {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] matrixSize = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        StringBuilder sumOfRowElementsPerRow = new StringBuilder();

        int[][] matrix = new int[matrixSize[0]][matrixSize[1]];
        fillMatrixWhileSumRowElements(matrixSize, matrix, sumOfRowElementsPerRow);

        System.out.println("Row Sums: " + sumOfRowElementsPerRow);
        System.out.println("Column Sums: " + sumOfColumnElementsPerColumn(matrix, matrixSize));

    }

    private static StringBuilder sumOfColumnElementsPerColumn(int[][] matrix, int[] matrixSize) {

        StringBuilder columnElementsSum = new StringBuilder();

        int rowSum = 0;

        for (int col = 0; col < matrixSize[1]; col++) {

            if (col > 0) {
                columnElementsSum.append(", ");
            }

            for (int row = 0; row < matrixSize[0]; row++) {

                rowSum += matrix[row][col];

            }

            columnElementsSum.append(rowSum);

            rowSum = 0;

        }

        return columnElementsSum;

    }

    /*
    Fills given elements in the matrix and calculates elements sum of single row.
     */

    private static void fillMatrixWhileSumRowElements(int[] matrixSize, int[][] matrix,
                                                      StringBuilder sumOfRowElementsPerRow) {
        int rowElementsSum = 0;

        for (int i = 0; i < matrixSize[0]; i++) {

            if (i > 0) {
                sumOfRowElementsPerRow.append(", ");
            }

            matrix[i] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int rowElements = 0; rowElements < matrix[i].length; rowElements++) {

                rowElementsSum += matrix[i][rowElements];

            }

            sumOfRowElementsPerRow.append(rowElementsSum);

            rowElementsSum = 0;

        }

    }

}
