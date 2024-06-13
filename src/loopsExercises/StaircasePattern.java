package loopsExercises;

import java.util.Scanner;

public class StaircasePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stepsNumber = Integer.parseInt(sc.nextLine());

        if (stepsNumber > 0) {
            int space = 1;

            for (int steps = 1; steps <= stepsNumber ; steps++) {

                if (2 < steps) {

                    for (int emptySpace = 1; emptySpace <= space ; emptySpace++) {
                        System.out.print(" ");
                    }

                    space += steps - 1;
                }


                for (int col = 1; col <= steps; col++) {

                    System.out.print("#");
                }
                System.out.println();
            }

        }

    }

}
