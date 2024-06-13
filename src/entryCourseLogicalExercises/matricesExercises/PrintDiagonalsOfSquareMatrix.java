package entryCourseLogicalExercises.matricesExercises;

import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int matrixSize = Integer.parseInt(sc.nextLine());

        System.out.println(findSquareMatrixDiagonals(matrixSize));

    }

    private static String findSquareMatrixDiagonals(int matrixSize) {

        String firstDiagonal = "";
        String secondDiagonal = "";

        for (int row = 0; row < matrixSize; row++) {

            String[] rowElements = sc.nextLine().split("\\s+");

            for (int col = 0; col < rowElements.length; col++) {

                if (row == col) {
                    firstDiagonal += (rowElements[col] + " ");
                    secondDiagonal += (rowElements[matrixSize - col - 1] + " ");
                    break;
                }

            }

        }

        return String.format("%s%n%s", firstDiagonal, secondDiagonal);

    }

}
