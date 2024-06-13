package matricesExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixBoundarySum {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] matrixDimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        printMatrixBoundarySum(matrixDimensions);

    }

    private static void printMatrixBoundarySum(int[] dimensions) {
        int sum = 0;

        for (int row = 0; row < dimensions[0]; row++) {

            int[] columns = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (row == 0 || row == dimensions[0] - 1) {

                for (int col = 0; col < columns.length; col++) {

                    sum += columns[col];

                }

            } else {

                sum += (columns[0] + columns[columns.length - 1]);
            }

        }

        System.out.println(sum);

    }

}
