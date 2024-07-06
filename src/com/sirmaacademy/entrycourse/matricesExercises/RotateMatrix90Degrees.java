package com.sirmaacademy.entrycourse.matricesExercises;

import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix90Degrees {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        int[][] matrix = new int[dimensions[0]][dimensions[1]];
        fillMatrixClockwise(dimensions, matrix);

        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix) {

        for (int[] el : matrix) {

            for (int n : el) {

                System.out.printf("%d ", n);
            }

            System.out.println();

        }

    }

    private static void fillMatrixClockwise(int[] dimensions, int[][] matrix) {

        for (int col = dimensions[0] - 1; col >= 0; col--) {

            int[] colElements = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int row = 0; row < dimensions[1]; row++) {

                matrix[row][col] = colElements[row];
            }

        }

    }

}
