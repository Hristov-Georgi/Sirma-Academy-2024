package entryCourseLogicalExercises.loopsExercises;

import java.util.Scanner;

public class UniqueCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumLimit = Integer.parseInt(sc.nextLine());
        int secondNumLimit = Integer.parseInt(sc.nextLine());
        int thirdNumLimit = Integer.parseInt(sc.nextLine());

        boolean isFirstOdd = false;

        if (2 <= firstNumLimit && firstNumLimit <= 9 &&
                2 <= secondNumLimit && secondNumLimit <= 9 &&
                2 <= thirdNumLimit && thirdNumLimit <= 9) {

            for (int first = 2; first <= firstNumLimit ; first++) {

                for (int second = 2; second <= secondNumLimit ; second++) {

                    for (int third = 2; third <= thirdNumLimit ; third++) {

                        if (first % 2 != 0) {
                            isFirstOdd = true;
                            break;
                        }

                        if (second == 4 || second == 6 || second == 8 || second == 9) {
                            break;
                        }

                        if (third % 2 == 0) {
                            System.out.printf("%d%d%d%n", first, second, third);
                        }

                    }

                    if (isFirstOdd) {
                        break;
                    }

                }

            }

        }

    }

}
