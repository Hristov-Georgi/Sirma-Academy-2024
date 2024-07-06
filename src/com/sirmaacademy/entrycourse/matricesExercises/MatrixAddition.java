package com.sirmaacademy.entrycourse.matricesExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] firstMatrix = fillMatrix(dimensions);
        int[][] secondMatrix = fillMatrix(dimensions);

        printSumOfIndicesOfTwoMatrices(firstMatrix, secondMatrix);

    }

    private static void printSumOfIndicesOfTwoMatrices(int[][] firstMatrix, int[][] secondMatrix) {

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                System.out.print(firstMatrix[row][col] + secondMatrix[row][col] + " ");
            }

            System.out.println();
        }

    }

    private static int[][] fillMatrix(int[] dimensions) {
        int[][] matrix = new int[dimensions[0]][dimensions[1]];

        for (int i = 0; i < dimensions[0]; i++) {

            matrix[i] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }

        return matrix;
    }


}
