package com.sirmaacademy.entrycourse.matricesExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSquareChecker {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (dimensions[0] != dimensions[1]) {
            System.out.println("Matrix is not square");
            return;
        }

        int[][] matrix = new int[dimensions[0]][dimensions[1]];
        fillMatrix(dimensions, matrix);

        printResult(matrix);


    }

    private static void printResult(int[][] matrix) {

        long rowSum = rowSum(matrix);

        if (rowSum == diagonalSum(matrix) && rowSum == columnsSum(matrix)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    private static long rowSum(int[][] matrix) {
        long initialSum = 0;
        long currentSum = 0;

        for (int i = 0; i < matrix.length; i++) {

            if (i == 0) {
                initialSum = Arrays.stream(matrix[i]).sum();
            } else {
                currentSum = Arrays.stream(matrix[i]).sum();
            }

            if (currentSum != 0 && initialSum != currentSum) {
                return -3;
            }

        }

        return initialSum;

    }

    private static long diagonalSum(int[][] matrix) {
        int length = matrix.length - 1;

        long firstDiagonalSum = 0;
        long secondDiagonalSum = 0;

        for (int row = 0; row < matrix.length; row++) {

            firstDiagonalSum += matrix[row][row];
            secondDiagonalSum += matrix[row][length - row];

        }

        if (firstDiagonalSum != secondDiagonalSum) {
            return -2;
        } else {
            return firstDiagonalSum;
        }

    }

    private static long columnsSum(int[][] matrix) {

        long initialSum = 0;
        long currentSum = 0;

        for (int col = 0; col < matrix.length; col++) {

            for (int row = 0; row < matrix.length; row++) {

                if (col == 0) {
                    initialSum += matrix[row][col];
                } else {
                    currentSum += matrix[row][col];
                }

            }

            if (col != 0 && initialSum != currentSum) {
                return -1;
            }

            currentSum = 0;

        }

        return initialSum;

    }

    private static void fillMatrix(int[] dimensions, int[][] matrix) {

        for (int i = 0; i < dimensions[0]; i++) {

            matrix[i] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }

    }

}
