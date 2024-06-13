package entryCourseLogicalExercises.conditionalStatementsTasks;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());
        String membership = sc.nextLine();


        String discountResult = null;
        if (age >= 0 && (membership.equals("Yes") || membership.equals("No"))) {

            if (age < 18) {
                discountResult = "10% discount";
            } else if(age < 65) {

                if(membership.equals("Yes")) {
                    discountResult = "20% discount";
                } else {
                    discountResult = "10% discount";
                }

            } else {
                discountResult = "30% discount";
            }

        } else {
            discountResult = "Incorrect input data";
        }

        System.out.println(discountResult);

    }
}
