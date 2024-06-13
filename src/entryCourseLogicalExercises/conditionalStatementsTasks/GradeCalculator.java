package entryCourseLogicalExercises.conditionalStatementsTasks;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        try {
            int percentage = Integer.parseInt(input);

            char grade;
            if (percentage >= 0 && percentage <= 69) {

                if(percentage <= 59) {
                    grade = 'F';
                } else {
                    grade = 'D';
                }

            } else if (percentage >= 70 && percentage <= 100) {

                if (percentage <= 79) {
                    grade = 'C';
                } else if (percentage <= 89) {
                    grade = 'B';
                } else {
                    grade = 'A';
                }

            } else {
                System.out.println("Percentage should be between 0 and 100");
                return;
            }

            System.out.println(grade);

        } catch (NumberFormatException ex) {
            System.out.println("Enter Integer number from 0 to 100");
        }

    }
}
