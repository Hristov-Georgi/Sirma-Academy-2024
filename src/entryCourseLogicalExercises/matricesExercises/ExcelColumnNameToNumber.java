package entryCourseLogicalExercises.matricesExercises;

import java.util.Scanner;

public class ExcelColumnNameToNumber {

    /*
     * This index is used to be subtracted from char value to receive char number in english alphabet.
     * For example 'A' = 65, current number of 'A' in english alphabet is 1 (65 - 64). 'B' = 2, 'C' = 3 ...
     */
    private static final int INDEX_TO_SUBTRACT = 64;
    private static final int ENGLISH_ALPHABET_COUNT = 26;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        char[] excelColumnName = sc.nextLine().toCharArray();

        System.out.println(findExcelColumnNumber(excelColumnName));
    }

    private static int findExcelColumnNumber(char[] excelColumnName) {

        int sum = 0;

        if (65 <= excelColumnName[0] && excelColumnName[0] <= 90) {

            if (excelColumnName.length == 3 && excelColumnName[1] <= 77 && excelColumnName[2] <= 74) {

                sum = ((excelColumnName[0] - INDEX_TO_SUBTRACT) * ENGLISH_ALPHABET_COUNT * ENGLISH_ALPHABET_COUNT +
                        (excelColumnName[1] - INDEX_TO_SUBTRACT) * ENGLISH_ALPHABET_COUNT +
                        excelColumnName[2] - INDEX_TO_SUBTRACT);

            } else if (excelColumnName.length == 2 && excelColumnName[1] <= 74) {

                sum = ((excelColumnName[0] - INDEX_TO_SUBTRACT) * ENGLISH_ALPHABET_COUNT +
                        excelColumnName[1] - INDEX_TO_SUBTRACT);

            } else {

                sum = excelColumnName[0] - INDEX_TO_SUBTRACT;
            }

        }

        return sum;

    }

}
