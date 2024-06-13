package entryCourseLogicalExercises.conditionalStatementsTasks;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOne = Integer.parseInt(sc.nextLine());
        int numberTwo = Integer.parseInt(sc.nextLine());

        if (numberOne > numberTwo) {
            System.out.println(numberOne);
        } else if (numberOne < numberTwo) {
            System.out.println(numberTwo);
        } else {
            System.out.println("Numbers are equal.");
        }


    }
}
