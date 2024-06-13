package entryCourseLogicalExercises.matricesExercises;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrixTraversal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] matrixDimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[][] matrix = new String[matrixDimensions[0]][matrixDimensions[1]];
        fillMatrix(matrixDimensions, matrix);

        printElementsInSpiralOrder(matrix, matrixDimensions);


    }

    private static void printElementsInSpiralOrder(String[][] matrix, int[] matrixDimensions) {

        int firstRow = 0;
        int lastRow = matrixDimensions[0] - 1;
        int firstColumn = 0;
        int lastColumn = matrixDimensions[1] - 1;

        int iterations = 0;

        if (matrixDimensions[0] > matrixDimensions[1]) {
            iterations = matrixDimensions[1];
        }


        while (iterations < matrixDimensions[0]) {

            if (iterations % 2 == 0) {

                for (int col = firstColumn; col <= lastColumn; col++) {
                    System.out.print(matrix[firstRow][col] + " ");

                }

                for (int row = firstRow + 1; row <= lastRow; row++) {
                    System.out.print(matrix[row][lastColumn] + " ");
                }

                firstRow++;
                lastColumn--;

            } else {

                for (int c = lastColumn; c >= firstColumn; c--) {
                    System.out.print(matrix[lastRow][c] + " ");
                }

                for (int rUp = lastRow - 1; rUp >= firstRow; rUp--) {
                    System.out.print(matrix[rUp][firstColumn] + " ");
                }

                firstColumn++;
                lastRow--;

            }

            iterations++;

        }

    }

    private static void fillMatrix(int[] dimensions, String[][] matrix) {

        for (int i = 0; i < dimensions[0]; i++) {

            matrix[i] = sc.nextLine().split("\\s+");

        }

    }

}


