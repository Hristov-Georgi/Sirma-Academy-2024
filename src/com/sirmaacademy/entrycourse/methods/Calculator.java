package com.sirmaacademy.entrycourse.methods;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());

        printCalculationResult(command, firstNum, secondNum);

    }

    private static void printCalculationResult(String command, int firstNum, int secondNum) {
        Integer result = null;

        switch (command) {

            case "add":
                result = addTwoNumbers(firstNum, secondNum);
                break;

            case "subtract" :
                result = subtractTwoNumbers(firstNum, secondNum);
                break;

            case "multiply":
                result = multiplyTwoNumbers(firstNum, secondNum);
                break;

            case "divide":
                try {
                    result = divideTwoNumbers(firstNum, secondNum);
                } catch (ArithmeticException ex) {
                    System.out.println("Can't divide by zero");
                    return;
                }

                break;

        }

        System.out.println(result);

    }

    private static int divideTwoNumbers(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    private static int multiplyTwoNumbers(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    private static int subtractTwoNumbers(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    private static int addTwoNumbers(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
