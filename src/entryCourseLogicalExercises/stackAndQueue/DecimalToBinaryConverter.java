package entryCourseLogicalExercises.stackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimalNum = Integer.parseInt(sc.nextLine());

        ArrayDeque<Integer> binaryNumDeque = calculateBinaryNum(decimalNum);
        printBinaryNum(binaryNumDeque);



    }

    private static void printBinaryNum(ArrayDeque<Integer> binaryNumDeque) {

        for (int n : binaryNumDeque) {
            System.out.print(n);
        }

        System.out.println();
    }

    private static ArrayDeque<Integer> calculateBinaryNum(int decimalNum) {
        ArrayDeque<Integer> binaryNumDeque = new ArrayDeque<>();

        if (decimalNum == 0) {
            binaryNumDeque.push(0);
            return binaryNumDeque;
        }

        while (decimalNum > 0) {

            int remainder = decimalNum % 2;
            binaryNumDeque.push(remainder);

            decimalNum /= 2;
        }

        return binaryNumDeque;

    }
}
