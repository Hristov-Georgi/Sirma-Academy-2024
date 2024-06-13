package entryCourseLogicalExercises.conditionalStatementsTasks;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double speed = Double.parseDouble(sc.nextLine());

        String speedInfo;

        if (speed < 0) {
            speedInfo = "speed can't be negative number";
        } else if (speed <= 10) {
            speedInfo = "slow";
        } else if (speed <= 60) {
            speedInfo = "average";
        } else if (speed <= 120) {
            speedInfo = "fast";
        } else if (speed <= 160) {
            speedInfo = "super fast";
        } else {
            speedInfo = "turbo fast";
        }

        System.out.println(speedInfo);

    }
}
