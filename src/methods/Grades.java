package methods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = Double.parseDouble(sc.nextLine());

        printGradeInWords(grade);

    }

    private static void printGradeInWords(double grade) {

        String gradeInWords = "";
        if (2.0 <= grade && grade <= 2.99) {
            gradeInWords = "Fail";
        } else if (grade <= 3.49) {
            gradeInWords = "Poor";
        } else if (grade <= 4.49) {
            gradeInWords = "Good";
        } else if (grade <= 5.49) {
            gradeInWords = "Very good";
        } else if (grade <= 6.00) {
            gradeInWords = "Excellent";
        }

        if (grade >= 2.00 && grade <= 6.00) {
            System.out.println(gradeInWords);
        }


    }

}
