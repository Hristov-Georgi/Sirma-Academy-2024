package com.sirmaacademy.entrycourse.matricesExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ChessboardChecker {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (dimensions[0] != dimensions[1]) {
            System.out.println("Chessboard length and with should be equal");
            return;
        }

        int[][] matrix = new int[dimensions[0]][dimensions[1]];
        ArrayDeque<Integer> queensCoordinates = new ArrayDeque<>();

        fillMatrixGetQueensCoordinates(dimensions, matrix, queensCoordinates);

        printIfQueensAreThreaten(queensCoordinates, matrix, dimensions);

    }

    private static void printIfQueensAreThreaten(ArrayDeque<Integer> queenCoordinates, int[][] matrix, int[] dimensions) {

        if (checkIfQueensAreThreaten(queenCoordinates, matrix, dimensions)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static boolean checkIfQueensAreThreaten(ArrayDeque<Integer> queenCoordinates, int[][] matrix, int[] dimensions) {

        if (queenCoordinates.isEmpty()) {
            return false;
        }

        int iterations = queenCoordinates.size() / 2;

        for (int i = 0; i < iterations; i++) {

            int queenRow = queenCoordinates.pollFirst();
            int queenCol = queenCoordinates.pollFirst();

            if (checkMainDiagonals(matrix)) {
                return true;
            }

            if (checkRow(queenCol, matrix) ||
                checkColumn(queenRow, matrix) ||
                descendingRowRisingCol(queenRow, queenCol, matrix) ||
                risingRowCol(queenRow, queenCol, matrix) ||
                descendingRowCol(queenRow,  queenCol, matrix) ||
                risingRowDescendingCol(queenRow, queenCol, matrix)) {

                return true;
            }

        }

        return false;

    }

    private static boolean checkRow(int col, int[][] matrix) {

        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][col];
        }

        return areQueensThreaten(sum);
    }

    private static boolean checkColumn(int row, int[][] matrix) {

        int sum = 0;

        for (int col = 0; col < matrix[row].length; col++) {
            sum += matrix[row][col];
        }

        return areQueensThreaten(sum);
    }

    private static boolean checkMainDiagonals(int[][] matrix) {

        int sum = 0;

        for (int mainDiagonal = 0; mainDiagonal < matrix.length; mainDiagonal++) {
            sum += matrix[mainDiagonal][mainDiagonal];
        }

        if (sum > 1) {
            return true;
        }

        sum = 0;

        for (int secondaryDiagonal = matrix.length - 1; secondaryDiagonal >= 0; secondaryDiagonal--) {
            sum += matrix[secondaryDiagonal][matrix.length - 1 - secondaryDiagonal];
        }

        return areQueensThreaten(sum);
    }

    private static boolean descendingRowRisingCol(int rows, int column, int[][] matrix) {

        int sum = 0;
        while (rows >= 0) {

            sum += matrix[rows][column];
            rows--;
            column++;

            if (column > matrix.length - 1) {
                break;
            }

        }

        return areQueensThreaten(sum);
    }

    private static boolean risingRowCol(int rows, int column, int[][] matrix) {

        int sum = 0;
        while (rows < matrix.length) {

            sum += matrix[rows][column];
            rows++;
            column++;

            if (column > matrix.length - 1) {
                break;
            }

        }

        return areQueensThreaten(sum);

    }

    private static boolean descendingRowCol(int rows, int column, int[][] matrix) {

        int sum = 0;
        while (rows >= 0) {

            sum += matrix[rows][column];
            rows--;
            column--;

            if (column < 0) {
                break;
            }

        }

        return areQueensThreaten(sum);
    }

    private static boolean risingRowDescendingCol(int rows, int column, int[][] matrix) {

        int sum = 0;
        while (rows < matrix.length) {

            sum += matrix[rows][column];
            rows++;
            column--;

            if (column < 0) {
                break;
            }

        }

        return areQueensThreaten(sum);
    }

    private static boolean areQueensThreaten(int sum) {

        return sum > 1;
    }

    /*
    Fill matrix and stores queen coordinates in a ArrayDeque queue. (first for export is the row, second is the column).
     */

    private static void fillMatrixGetQueensCoordinates(int[] dimensions, int[][] matrix, ArrayDeque<Integer> queenCoordinates) {

        for (int row = 0; row < dimensions[0]; row++) {

            int[] columns = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = columns;

            for (int col = 0; col < dimensions[1]; col++) {

                if (columns[col] == 1) {
                    queenCoordinates.offer(row);
                    queenCoordinates.offer(col);
                }

            }

        }

    }

}