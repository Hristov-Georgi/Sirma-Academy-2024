package entryCourseLogicalExercises.methods;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double firstNum = Double.parseDouble(sc.nextLine());
        char operator = sc.nextLine().charAt(0);
        double secondNum = Double.parseDouble(sc.nextLine());

        try {
            System.out.printf("%.2f%n", calculateResultByGivenOperator(operator, firstNum, secondNum));
        } catch (ArithmeticException ex) {
            System.out.println("Check input data. You can't divide by zero.");
        }

    }

    private static double calculateResultByGivenOperator(char operator, double firstNum, double secondNum) {

        Double result = null;
        switch (operator) {

            case '+':
                result = firstNum + secondNum;
                break;

            case '-':
                result = firstNum - secondNum;
                break;

            case '*':
                result = firstNum * secondNum;
                break;

            case '/':

                    result = firstNum / secondNum;
                break;

        }

        return result;
    }

}

