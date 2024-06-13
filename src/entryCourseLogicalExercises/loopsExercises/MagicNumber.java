package entryCourseLogicalExercises.loopsExercises;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startNum = Integer.parseInt(sc.nextLine());
        int endNum = Integer.parseInt(sc.nextLine());
        int magicNumber = Integer.parseInt(sc.nextLine());

        boolean isFound = false;
        int combinationSequence = 0;

        if (1 <= startNum &&
                startNum < endNum &&
                endNum <= 1000 &&
                1 <= magicNumber &&
                magicNumber <= 10000) {

            int firstNum = 0;
            int secondNum = 0;

            for (int first = startNum; first <= endNum ; first++) {
                for (int second = startNum; second <= endNum ; second++) {

                    combinationSequence++;

                    if ((first + second) == magicNumber) {
                        firstNum = first;
                        secondNum = second;
                        isFound = true;
                        break;
                    }

                }

                if (isFound) {
                    break;
                }

            }

            if (isFound) {
                System.out.printf("Combination %d - (%d + %d = %d)",
                       combinationSequence, firstNum,  secondNum, magicNumber);
            } else {
                System.out.printf("%d combinations - neither equals %d",
                        combinationSequence, magicNumber);
            }

        }



    }

}
