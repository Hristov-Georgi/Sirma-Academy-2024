package entryCourseLogicalExercises.stackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] parenthesesArr = sc.nextLine().toCharArray();

        if (parenthesesArr.length % 2 == 0) {
            printComparedResult(parenthesesArr);
        } else {
            System.out.println("False");
        }

    }

    private static void printComparedResult(char[] parenthesesArr) {

        if (compareParenthesesEquality(parenthesesArr)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    private static boolean compareParenthesesEquality(char[] parenthesesArr) {

        ArrayDeque<Character> firstHalfSymbols = fillFirstHalfToCompare(parenthesesArr);

        for (int i = parenthesesArr.length / 2; i < parenthesesArr.length; i++) {
            char symbolToCompare = firstHalfSymbols.pop();

            if (symbolToCompare == '(' && parenthesesArr[i] != ')') {
               return false;
            } else if (symbolToCompare == '[' && parenthesesArr[i] != ']') {
                return false;
            } else if (symbolToCompare == '{' && parenthesesArr[i] != '}') {
                return false;
            }

        }

        return true;

    }

    private static ArrayDeque<Character> fillFirstHalfToCompare(char[] parenthesesArr) {

        ArrayDeque<Character> firstHalfParenthesesStack = new ArrayDeque<>();

        for (int i = 0; i < parenthesesArr.length / 2; i++) {
            firstHalfParenthesesStack.push(parenthesesArr[i]);
        }

        return firstHalfParenthesesStack;
    }

}
