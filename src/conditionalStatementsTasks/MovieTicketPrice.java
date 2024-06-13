package conditionalStatementsTasks;

import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());

        String ticketPrice;

        if (age >= 0) {

            if (age <= 12) {
                ticketPrice = "$5";
            } else if(age <= 19) {
                ticketPrice = "$8";
            } else {
                ticketPrice = "$10";
            }

        } else {
            ticketPrice = "Age can't be negative number";
        }

        System.out.println(ticketPrice);
    }
}
