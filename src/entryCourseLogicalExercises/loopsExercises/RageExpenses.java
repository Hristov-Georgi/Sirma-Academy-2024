package entryCourseLogicalExercises.loopsExercises;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        double totalExpenses = 0.0;

        if (lostGamesCount / 2 > 0) {
            totalExpenses += (headsetPrice * (lostGamesCount / 2));
        }

        if (lostGamesCount / 3 > 0) {
            totalExpenses += (mousePrice * (lostGamesCount / 3));
        }

        if (lostGamesCount / 6 > 0) {
            totalExpenses += (keyboardPrice * (lostGamesCount / 6));
        }

        if (lostGamesCount / 12 > 0) {
            totalExpenses += (displayPrice * (lostGamesCount / 12));
        }

        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);

    }
}
