package entryCourseLogicalExercises.loopsExercises;

import java.util.Scanner;

public class EvenPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstPairNum = Integer.parseInt(sc.nextLine());
        int secondPairNum = Integer.parseInt(sc.nextLine());
        int firstPairDifference = Integer.parseInt(sc.nextLine());
        int secondPairDifference = Integer.parseInt(sc.nextLine());

        if (10 <= firstPairNum && firstPairNum <= 90 &&
                10 <= secondPairNum && secondPairNum <= 90 &&
                1 <= firstPairDifference && firstPairDifference <= 9 &&
                1 <= secondPairDifference && secondPairDifference <= 9) {

            for (int firstNum = firstPairNum; firstNum <= firstPairNum + firstPairDifference; firstNum++) {

                if (firstNum % 2 == 0 ||
                        firstNum % 3 == 0 ||
                        firstNum % 5 == 0 ||
                        firstNum % 7 == 0) {

                    continue;

                }

                for (int secondNum = secondPairNum; secondNum < secondPairNum + secondPairDifference; secondNum++) {

                    if (secondNum % 2 != 0 &&
                            secondNum % 3 != 0 &&
                            secondNum % 5 != 0 &&
                            secondNum % 7 != 0) {

                        System.out.printf("%d%d%n", firstNum, secondNum);
                    }




                }

            }

        }

    }

}
