package conditionalStatementsTasks;

import java.util.Scanner;

public class AlarmAfter15Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputHour = Integer.parseInt(sc.nextLine());
        int inputMinutes = Integer.parseInt(sc.nextLine());

        if (inputHour >= 0 && inputHour <= 23 && inputMinutes >= 0 && inputMinutes <= 59) {
            int addedMinutes = inputMinutes + 15;

            if (addedMinutes >= 60 && inputHour == 23) {
                int hour = 0;
                int minutes = addedMinutes - 60;
                System.out.printf("%d:%02d", hour, minutes);

            } else if (addedMinutes >= 60) {
                int hour = inputHour + 1;
                int minutes = addedMinutes - 60;
                System.out.printf("%d:%02d", hour, minutes);
            } else {
                System.out.printf("%d:%02d", inputHour, addedMinutes);
            }

        } else {
            System.out.println("Invalid input");
        }
    }
}
