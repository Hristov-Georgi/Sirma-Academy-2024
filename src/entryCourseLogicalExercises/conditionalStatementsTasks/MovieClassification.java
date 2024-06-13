package entryCourseLogicalExercises.conditionalStatementsTasks;

import java.util.Scanner;

public class MovieClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());

        if (age >= 0) {

            if (age < 13) {
                System.out.println("U-rated movies");
            } else if (age < 18) {
                System.out.println("U and PG-13 rated movies");
            } else {
                System.out.println("All movies");
            }

        } else {
            System.out.println("Incorrect age. Age should not be a negative number");
        }
    }
}
