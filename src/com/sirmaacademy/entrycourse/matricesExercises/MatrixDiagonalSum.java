package com.sirmaacademy.entrycourse.matricesExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixDiagonalSum {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] matrixSize = Arrays.stream(sc.nextLine().split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        System.out.println(findSumOfSquareMatrixDiagonals(matrixSize));

    }

    private static int findSumOfSquareMatrixDiagonals(int[] matrixSize) {
        int sum = 0;

        for (int row = 0; row < matrixSize[0]; row++) {

            int[] rowElements = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int col = 0; col < rowElements.length; col++) {

                if (row == col) {
                    sum += (rowElements[col] + rowElements[matrixSize[0] - col - 1]);
                    break;
                }

            }

        }

        return sum;

    }

}
