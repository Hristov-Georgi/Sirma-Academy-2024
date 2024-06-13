package matricesExercises;

import java.util.Arrays;
import java.util.Scanner;

public class CheckerboardPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());

        printMatrix(createCheckerboardMatrix(size));

    }

    private static void printMatrix(int[][] matrix) {

        for(int[] r : matrix) {
            System.out.println(Arrays.toString(r)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", ""));
        }

    }

    private static int[][] createCheckerboardMatrix(int size) {
        int[][] matrix   = new int[size][size];

        /*
        If current row is even number -> start number is 0, second number is 1 and rotating till the end of sequence.
        Else if current row is odd number -> start number is 1, second is 0 and rotating till the end of sequence.
         */
        int zero = 0;
        int one = 1;

        for (int row = 0; row < size; row++) {

            if (row % 2 == 0) {

                fillWithZeroAndOne(matrix, size, row, zero, one);

            } else {

               fillWithZeroAndOne(matrix, size, row, one, zero);

            }

        }

        return matrix;

    }

    private static void fillWithZeroAndOne(int[][] matrix, int size, int currentRow, int evenRow, int oddRow) {

        for (int col = 0; col < size; col += 2) {
            matrix[currentRow][col] = evenRow;
        }

        for (int cols = 1; cols < size; cols += 2) {
            matrix[currentRow][cols] = oddRow;
        }

    }

}
