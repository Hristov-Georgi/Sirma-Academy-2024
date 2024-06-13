package entryCourseLogicalExercises.conditionalStatementsTasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double firstNumber = Double.parseDouble(sc.nextLine());
        double secondNumber = Double.parseDouble(sc.nextLine());
        String function = sc.nextLine();

        double result;

        switch (function) {
            case "add":
                result = firstNumber + secondNumber;
                break;
            case "subtract":
                result = firstNumber - secondNumber;
                break;
            case "multiply":
                result = firstNumber * secondNumber;
                break;
            case "divide":

                if (secondNumber == 0) {
                    System.out.println("Can't divide by zero");
                    return;
                } else {
                    result = firstNumber / secondNumber;
                }

                break;
            default:
                System.out.println("Invalid command");
                return;
        }

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(df.format(result));
    }
}
