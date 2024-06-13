package entryCourseLogicalExercises.conditionalStatementsTasks;

import java.time.YearMonth;
import java.util.Scanner;

public class DaysInAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int notLeapYear = 2023;
        int month = Integer.parseInt(sc.nextLine());

        if(month >= 1 && month <= 12) {
            YearMonth yearMonth = YearMonth.of(notLeapYear, month);

            System.out.println(yearMonth.lengthOfMonth());
        } else {
            System.out.println("Invalid month.");
        }

    }
}
