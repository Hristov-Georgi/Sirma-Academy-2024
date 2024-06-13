package matricesExercises;

import java.util.*;

public class ZeroMatrix {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] matrixDimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[matrixDimensions[0]][matrixDimensions[1]];
        fillMatrix(matrixDimensions, matrix);

        /*
        Here I collect 0 element coordinates - row, column.
         */
        ArrayDeque<Integer> rowsNumberDeck = new ArrayDeque<>();
        ArrayDeque<Integer> columnsNumberDeck = new ArrayDeque<>();

        findZeroElements(matrix, rowsNumberDeck, columnsNumberDeck);
        setRowElementsToZero(rowsNumberDeck, matrixDimensions[1], matrix);
        setColumnElementsToZero(columnsNumberDeck, matrixDimensions[0], matrix);

        printFinalMatrix(matrix);

    }

    private static void printFinalMatrix(int[][] matrix) {

        for (int[] rows : matrix) {

            for (int cols : rows) {
                System.out.printf("%d ", cols);
            }

            System.out.println();
        }

    }

    private static void setColumnElementsToZero(ArrayDeque<Integer> columnsNumberDeck, int matrixRowsSize, int[][] matrix) {

        while (!columnsNumberDeck.isEmpty()) {

            int col = columnsNumberDeck.poll();

            for (int row = 0; row < matrixRowsSize; row++) {

                if (matrix[row][col] != 0) {
                    matrix[row][col] = 0;
                }

            }

        }

    }

    private static void setRowElementsToZero(ArrayDeque<Integer> rowsNumberDeck, int matrixColumnSize, int[][] matrix) {

        while (!rowsNumberDeck.isEmpty()) {

            int row = rowsNumberDeck.poll();

            for (int col = 0; col < matrixColumnSize; col++) {

                if (matrix[row][col] != 0) {
                    matrix[row][col] = 0;
                }

            }

        }

    }

    private static void findZeroElements(int[][] matrix, ArrayDeque<Integer> rowsNumberDeck,
                                                        ArrayDeque<Integer> columnsNumberDeck) {

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                if (matrix[row][col] == 0) {

                    if (!rowsNumberDeck.contains(row)) {
                        rowsNumberDeck.push(row);
                    }

                    if (!columnsNumberDeck.contains(col)) {
                        columnsNumberDeck.push(col);
                    }

                }

            }

        }

    }

    private static void fillMatrix(int[] dimensions, int[][] matrix) {

        for (int i = 0; i < dimensions[0]; i++) {

            matrix[i] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }

    }

}
