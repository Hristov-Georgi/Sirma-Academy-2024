package entryCourseLogicalExercises.conditionalStatementsTasks;

import java.util.Scanner;

public class AddressByAgeAndGender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double age = Double.parseDouble(sc.nextLine());
        char gender = sc.nextLine().charAt(0);

        String result;

        if (age >= 0 && gender == 'f') {

            if (age < 16) {
                result = "Miss";
            } else {
                result = "Ms.";
            }

        } else if (age >= 0 && gender == 'm') {

            if (age < 16) {
                result = "Master";
            } else {
                result = "Mr.";
            }

        } else {
            result = "Invalid input";
        }

        System.out.println(result);
    }

}
