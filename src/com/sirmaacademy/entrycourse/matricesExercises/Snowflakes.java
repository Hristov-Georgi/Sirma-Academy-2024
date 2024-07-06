package com.sirmaacademy.entrycourse.matricesExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Snowflakes {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int[] matrixSize = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        char[][] matrix = new char[matrixSize[0]][matrixSize[1]];
        fillMatrix(matrixSize, matrix);

        letItSnow(matrix, matrixSize);

    }

    private static void letItSnow(char[][] matrix, int[] matrixSize) {

        char barrier = '#';
        char snowflake = '*';

        List<Integer> blockedColumns = new ArrayList<>();

        for (int row = 0; row < matrixSize[0] - 1; row++) {

            for (int col = 0; col < matrixSize[1]; col++) {

                if (blockedColumns.contains(col)) {
                    continue;
                }

                if (matrix[row][col] == snowflake && matrix[row + 1][col] != barrier) {

                    matrix[row][col] = matrix[row + 1][col];
                    matrix[row +1][col] = snowflake;

                } else if (matrix[row][col] == snowflake && matrix[row + 1][col] == barrier) {

                    blockedColumns.add(col);

                    if (blockedColumns.size() == matrixSize[1]) {

                        printCurrentMatrix(matrix);
                        return;

                    }

                }

            }

            if (row != 0) {
                String space = "=".repeat(matrixSize[0]);
                System.out.println(space);
            }

            printCurrentMatrix(matrix);

        }

    }

    private static void printCurrentMatrix(char[][] matrix) {

        for (char[] c : matrix) {

            System.out.println(Arrays.toString(c)
                                        .replace("[", "")
                                        .replace("]", "")
                                        .replace(",", ""));

        }

    }

    private static void fillMatrix(int[] size, char[][] matrix) {

        for (int row = 0; row < size[0]; row++) {

            String[] symbols = sc.nextLine().split("\\s+");

            for (int col = 0; col < size[1]; col++) {

                matrix[row][col] = symbols[col].charAt(0);

            }

        }

    }

}
