package matricesExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExcelSumFormula {

    private static final int INDEX_TO_SUBTRACT = 64;
    private static final int ENGLISH_ALPHABET_COUNT = 26;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = fillMatrix(dimensions);

        String[] excelCoordinates = sc.nextLine().split(":");
        char[] startCoordinates = excelCoordinates[0].toCharArray();
        char[] endCoordinates = excelCoordinates[1].toCharArray();

        int[] startRowCol = getColumnAndRowNumber(startCoordinates);
        int[] endRowCol = getColumnAndRowNumber(endCoordinates);

        printSumOfGivenRange(startRowCol, endRowCol, matrix);


    }

    private static void printSumOfGivenRange(int[] startColRow, int[] endColRow, int[][] matrix) {

        int sum = 0;

        /*
        I subtract 1 from column to include 0 value of the matrix.
         */
        for (int row = startColRow[1] - 1; row <= endColRow[1] - 1; row++) {

            for (int col = startColRow[0] - 1; col <= endColRow[0] -1; col++) {

                sum += matrix[row][col];
            }

        }

        System.out.println(sum);
    }

    private static int[] getColumnAndRowNumber(char[] coordinates) {

        List<Character> characterList = new ArrayList<>();

        String rowNumber = "";

        for (int i = 0; i < coordinates.length; i++) {

            if (65 <= coordinates[i] && coordinates[i] <= 90) {
                characterList.add(coordinates[i]);
            } else {
                rowNumber += coordinates[i];
            }

        }

        int column = findExcelColumnNumber(characterList);
        int row = Integer.parseInt(rowNumber);

        return new int[]{column, row};

    }

    private static int findExcelColumnNumber(List<Character> excelColumnName) {

        int sum = 0;

        if (65 <= excelColumnName.get(0) && excelColumnName.get(0) <= 90) {

            if (excelColumnName.size() == 3 && excelColumnName.get(1) <= 77 && excelColumnName.get(2) <= 74) {

                sum = ((excelColumnName.get(0) - INDEX_TO_SUBTRACT) * ENGLISH_ALPHABET_COUNT * ENGLISH_ALPHABET_COUNT +
                        (excelColumnName.get(1) - INDEX_TO_SUBTRACT) * ENGLISH_ALPHABET_COUNT +
                        excelColumnName.get(2) - INDEX_TO_SUBTRACT);

            } else if (excelColumnName.size() == 2 && excelColumnName.get(1) <= 74) {

                sum = ((excelColumnName.get(0) - INDEX_TO_SUBTRACT) * ENGLISH_ALPHABET_COUNT +
                        excelColumnName.get(1) - INDEX_TO_SUBTRACT);

            } else {

                sum = excelColumnName.get(0) - INDEX_TO_SUBTRACT;
            }

        }

        return sum;

    }

    private static int[][] fillMatrix(int[] dimensions) {

        int[][] matrix = new int[dimensions[0]][dimensions[1]];

        for (int row = 0; row < dimensions[0]; row++) {

           matrix[row] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }

        return matrix;

    }

}
