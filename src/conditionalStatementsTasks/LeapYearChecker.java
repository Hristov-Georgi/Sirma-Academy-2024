package conditionalStatementsTasks;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = Integer.parseInt(sc.nextLine());

        if (year < 0) {
            System.out.println("Year can't be negative number");
            return;
        }

        if (year % 100 == 0) {

            if (year % 400 == 0) {
                System.out.println("It‘s a leap year!");
            } else {
                System.out.println("It‘s not a leap year.");
            }

        } else if(year % 4 == 0) {
            System.out.println("It‘s a leap year!");
        } else {
            System.out.println("It‘s not a leap year.");
        }
    }
}
