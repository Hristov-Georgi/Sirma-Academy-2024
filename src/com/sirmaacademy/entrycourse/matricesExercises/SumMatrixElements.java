package com.sirmaacademy.entrycourse.matricesExercises;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] matrixDimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt)
                                .toArray();

        printDimensionsAndSumOfMatrixElements(matrixDimensions);

    }

    /*
    Reads matrix by given dimensions, sum its elements and print matrix dimensions and total elements sum.
     */

    private static void printDimensionsAndSumOfMatrixElements(int[] dimensions) {

        int sum = 0;

        for (int row = 0; row < dimensions[0]; row++) {

            int[] matrixRow = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int col = 0; col < dimensions[1]; col++) {

                sum += matrixRow[col];
            }

        }

        System.out.printf("%d%n%d%n%d", dimensions[0], dimensions[1], sum);

    }

}
