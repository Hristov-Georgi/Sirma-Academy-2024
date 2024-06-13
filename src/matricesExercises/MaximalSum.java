package matricesExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int[] matrixSize = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (matrixSize[0] < 3 || matrixSize[1] < 3) {
            System.out.println("Invalid size");
            return;
        }

        int[][] matrix = new int[matrixSize[0]][];
        fillMatrix(matrixSize[0], matrix);

        // Elements order: total sum, start row, start column.
        int[] matrix3x3Elements = {0, 0, 0};
        findSubMatrixElements(matrixSize, matrix, matrix3x3Elements);

        printSubMatrix(matrix3x3Elements, matrix);


    }

    private static void printSubMatrix(int[] subMatrixElements, int[][] originalMatrix) {

        System.out.println(subMatrixElements[0]);

        for (int row = subMatrixElements[1]; row < subMatrixElements[1] + 3 ; row++) {

            for (int col = subMatrixElements[2]; col < subMatrixElements[2] + 3 ; col++) {

                System.out.print(originalMatrix[row][col] + " ");
            }

            System.out.println();

        }

    }



    private static void findSubMatrixElements(int[] originalMatrixDimensions,int[][] originalMatrix, int[] subMatrixElements) {

        for (int row = 0; row < originalMatrixDimensions[0] - 2; row++) {

            for (int col = 0; col < originalMatrixDimensions[1] - 2; col++) {

                int currentSum = originalMatrix[row][col] + originalMatrix[row][col + 1] + originalMatrix[row][col + 2]
                        + originalMatrix[row + 1][col] + originalMatrix[row + 1][col + 1] + originalMatrix[row + 1][col + 2]
                        + originalMatrix[row + 2][col] + originalMatrix[row + 2][col + 1] + originalMatrix[row + 2][col + 2];

                if (currentSum > subMatrixElements[0]) {

                    subMatrixElements[0] = currentSum;
                    subMatrixElements[1] = row;
                    subMatrixElements[2] = col;

                }

            }

        }

    }

    private static void fillMatrix(int rows, int[][] matrix) {

        for (int row = 0; row < rows; row++) {

            matrix[row] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }

    }

}
