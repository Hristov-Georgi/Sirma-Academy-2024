package entryCourseLogicalExercises.matricesExercises;

import java.util.Arrays;
import java.util.Scanner;

public class FillTheMatrix {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] matrixRequirements = sc.nextLine().split("\\s+");

        int squareMatrixDimensions = Integer.parseInt(matrixRequirements[0]);
        char patternType = matrixRequirements[1].charAt(0);

        if (patternType == 'A') {
            printMatrix(fillMatrixPatternA(squareMatrixDimensions));
        } else if (patternType == 'B') {
            printMatrix(fillMatrixPatternB(squareMatrixDimensions));
        }

    }

    private static void printMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {

            System.out.println(Arrays.toString(matrix[row])
                    .replace(",", "")
                    .replace("[", "")
                    .replace("]", ""));
        }

    }

    private static int[][] fillMatrixPatternB(int dimensions) {
        int[][] matrix = new int[dimensions][dimensions];

        int startValue = 1;

        for (int col = 0; col < dimensions; col++) {

            if (col % 2 == 0) {

                for (int row = 0; row < dimensions; row++) {

                    matrix[row][col] = startValue;
                    startValue++;

                }

            } else {

                for (int row = dimensions - 1; row >= 0; row--) {

                    matrix[row][col] = startValue;
                    startValue++;
                }

            }

        }

        return matrix;
    }



    private static int[][] fillMatrixPatternA(int dimensions) {
        int[][] matrix = new int[dimensions][dimensions];

        int startValue = 1;

        for (int col = 0; col < dimensions; col++) {

            for (int row = 0; row < dimensions; row++) {

                matrix[row][col] = startValue;
                startValue++;
            }

        }

        return matrix;
    }

}
