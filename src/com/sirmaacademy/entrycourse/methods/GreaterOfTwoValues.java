package com.sirmaacademy.entrycourse.methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String variableType = sc.nextLine();

        switch (variableType) {

            case "int":
                int first = Integer.parseInt(sc.nextLine());
                int second = Integer.parseInt(sc.nextLine());

                printGreaterValue(first, second);

                break;

            case "char":
                char firstChar = sc.nextLine().charAt(0);
                char secondChar = sc.nextLine().charAt(0);

                printGreaterValue(firstChar, secondChar);

                break;

            case "string":
                String firstString = sc.nextLine();
                String secondString = sc.nextLine();

                printGreaterValue(firstString, secondString);

                break;
        }

    }

    private static void printGreaterValue(String firstValue, String secondValue) {
        int compareResult = getMax(firstValue, secondValue);

        if (compareResult > 0) {
            System.out.println(firstValue);
        } else if (compareResult < 0) {
            System.out.println(secondValue);
        } else {
            System.out.println("Equal strings.");
        }

    }

    private static void printGreaterValue(char firstValue, char secondValue) {
        int compareResult = getMax(firstValue, secondValue);

        if (compareResult > 0) {
            System.out.println(firstValue);
        } else if (compareResult < 0) {
            System.out.println(secondValue);
        } else {
            System.out.println("Equal characters.");
        }

    }

    private static void printGreaterValue(int firstValue, int secondValue) {
        int compareResult = getMax(firstValue, secondValue);

        if (compareResult > 0) {
            System.out.println(firstValue);
        } else if (compareResult < 0) {
            System.out.println(secondValue);
        } else {
            System.out.println("Equal numbers.");
        }

    }

    private static int getMax(String firstValue, String secondValue) {
        return firstValue.compareTo(secondValue);
    }

    private static int getMax(char firstValue, char secondValue) {
        return Character.compare(firstValue, secondValue);
    }

    private static int getMax(int firstValue, int secondValue) {

        return Integer.compare(firstValue, secondValue);
    }


}
