package entryCourseLogicalExercises.loopsExercises;

import java.util.Scanner;

public class CoinsAndNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oneLevCoins = Integer.parseInt(sc.nextLine());
        int twoLevCoins = Integer.parseInt(sc.nextLine());
        int fiveLevBanknotes = Integer.parseInt(sc.nextLine());
        int sum = Integer.parseInt(sc.nextLine());

        for (int oneLev = 0; oneLev <= oneLevCoins ; oneLev++) {

            for (int twoLev = 0; twoLev <= twoLevCoins ; twoLev++) {

                for (int fiveLev = 0; fiveLev <= fiveLevBanknotes ; fiveLev++) {

                    int currentSum = oneLev + twoLev * 2 + fiveLev * 5;

                    if (currentSum == sum) {

                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n",
                                oneLev, twoLev, fiveLev, sum);

                    }

                }

            }

        }

    }

}
