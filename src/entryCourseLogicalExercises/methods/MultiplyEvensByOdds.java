package entryCourseLogicalExercises.methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        System.out.println(multiplySumOfEvenAndOddDigits(number));

    }

    private static int multiplySumOfEvenAndOddDigits(int num) {

        int evenSum = 0;
        int oddSum = 0;

        while (num > 0) {

            int currentDigit = num % 10;

            if (currentDigit % 2 == 0) {
                evenSum += currentDigit;
            } else {
                oddSum += currentDigit;
            }

            num /= 10;
        }

        return evenSum * oddSum;
    }

}
