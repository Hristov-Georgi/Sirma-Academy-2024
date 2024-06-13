package loopsExercises;

import java.util.Scanner;

public class EqualSumOfOddAndEvenPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startNum = Integer.parseInt(sc.nextLine());
        int endNum = Integer.parseInt(sc.nextLine());

        if (100000 <= startNum && endNum <= 300000) {

            int totalMatchingNumbers = 0;

            for (int i = startNum; i <= endNum; i++) {

                int evenSum = 0;
                int oddSum = 0;

                int currentNum = i;
                for (int j = 0; j < 6; j++) {

                    if (j % 2 == 0) {
                        evenSum += currentNum % 10;
                    } else {
                        oddSum += currentNum % 10;
                    }

                    currentNum = currentNum / 10;
                }

                if (evenSum == oddSum) {
                    System.out.println(i);
                    totalMatchingNumbers++;
                }

            }

            if (totalMatchingNumbers <= 0) {
                System.out.println("None");
            }

        }

    }

}
