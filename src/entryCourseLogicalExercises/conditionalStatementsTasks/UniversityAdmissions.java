package entryCourseLogicalExercises.conditionalStatementsTasks;

import java.util.Scanner;

public class UniversityAdmissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentScore = Integer.parseInt(sc.nextLine());
        int extracurricular = Integer.parseInt(sc.nextLine());

        if (studentScore > 0) {

            if (studentScore < 80) {
                System.out.println("Not admitted");
            } else if (studentScore <= 89 && extracurricular < 2) {
                System.out.println("Not admitted");
            } else {
                System.out.println("Admitted");
            }

        } else {
            System.out.println("Incorrect input data");
        }
    }
}
