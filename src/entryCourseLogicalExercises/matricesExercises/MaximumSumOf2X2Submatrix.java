package entryCourseLogicalExercises.matricesExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2Submatrix {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        According problem requirement elements for each matrix row should be separated by comma,
        but input data is without comma. I suggest there is spelling error in the problem.
        Therefore I am reading input data without comma.
         */

        int[] matrixDimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] originalMatrix = new int[matrixDimensions[0]][matrixDimensions[1]];
        fillMatrixFromConsole(matrixDimensions, originalMatrix);

        /*
        Here I am storing sub matrix elements sum, start row and start column.
         */

        int[] subMatrixElements = {0, 0, 0};

        findSubMatrixElements(matrixDimensions, originalMatrix, subMatrixElements);

        printSubMatrixAndElementsSum(originalMatrix, subMatrixElements[0],
                subMatrixElements[1], subMatrixElements[2]);

    }

    private static void printSubMatrixAndElementsSum(int[][] matrix, int elementsSum, int startRow, int startCol) {

        System.out.println(elementsSum);
        System.out.printf("%d %d%n", matrix[startRow][startCol], matrix[startRow][startCol + 1]);
        System.out.printf("%d %d%n", matrix[startRow + 1][startCol], matrix[startRow + 1][startCol + 1]);
    }


    private static void findSubMatrixElements(int[] originalMatrixDimensions,int[][] originalMatrix, int[] subMatrixElements) {

        for (int row = 0; row < originalMatrixDimensions[0] - 1; row++) {

            for (int col = 0; col < originalMatrixDimensions[1] - 1; col++) {

                int currentSum = originalMatrix[row][col] + originalMatrix[row][col + 1]
                        + originalMatrix[row + 1][col] + originalMatrix[row + 1][col + 1];

                if (currentSum > subMatrixElements[0]) {

                    subMatrixElements[0] = currentSum;
                    subMatrixElements[1] = row;
                    subMatrixElements[2] = col;

                }

            }

        }

    }

    private static void fillMatrixFromConsole(int[] dimensions, int[][] matrix) {

        for (int i = 0; i < dimensions[0]; i++) {

            matrix[i] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }

    }

}
