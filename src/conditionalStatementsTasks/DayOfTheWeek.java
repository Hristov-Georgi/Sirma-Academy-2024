package conditionalStatementsTasks;

import java.time.DayOfWeek;
import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        if (number >= 1 && number <= 7) {

            String day = null;

            switch (number) {
                case 1:
                    day = DayOfWeek.MONDAY.name();
                    break;
                case 2:
                    day = DayOfWeek.TUESDAY.name();
                    break;
                case 3:
                    day = DayOfWeek.WEDNESDAY.name();
                    break;
                case 4:
                    day = DayOfWeek.THURSDAY.name();
                    break;
                case 5:
                    day = DayOfWeek.FRIDAY.name();
                    break;
                case 6:
                    day = DayOfWeek.SATURDAY.name();
                    break;
                case 7:
                    day = DayOfWeek.SUNDAY.name();
                    break;
            }

            System.out.println(day);

        } else {
            System.out.println("Error");
        }

    }
}
