package matricesExercises;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] firstMatrixDimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] firstMatrix = fillMatrix(firstMatrixDimensions);

        int[] secondMatrixDimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (secondMatrixDimensions[0] != firstMatrixDimensions[0] ||
            secondMatrixDimensions[1] != firstMatrixDimensions[1]) {
            System.out.println("not equal");
            return;
        }

        int[][] secondMatrix = fillMatrix(secondMatrixDimensions);

        if (compareElementsOfTwoMatrices(firstMatrix, secondMatrix)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }

    private static boolean compareElementsOfTwoMatrices(int[][] firstMatrix, int[][] secondMatrix) {

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {

                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    return false;
                }

            }

        }

        return true;

    }

    private static int[][] fillMatrix(int[] dimensions) {
        int[][] matrix = new int[dimensions[0]][dimensions[1]];

        for (int i = 0; i < dimensions[0]; i++) {

            int[] columns = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = columns;
        }

        return matrix;

    }

}
