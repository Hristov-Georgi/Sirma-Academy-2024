package entryCourseLogicalExercises.stackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> openingBracketPositionStack = new ArrayDeque<>();

        char[] charArr = sc.nextLine().toCharArray();

        for (int i = 0; i < charArr.length; i++) {

            if (charArr[i] == '(' || charArr[i] == '[' || charArr[i] == '{') {
                openingBracketPositionStack.push(i);
            } else if (!openingBracketPositionStack.isEmpty() && (charArr[i] == ')' ||
                    charArr[i] == ']' ||
                    charArr[i] == '}')) {

                char previousBracketType = charArr[openingBracketPositionStack.peek()];

                if (compareBracketCompatibility(previousBracketType, charArr[i])) {
                    int startPosition = openingBracketPositionStack.pop();

                    printExpressionInBrackets(startPosition, i, charArr);
                }

            }

        }

    }

    private static boolean compareBracketCompatibility(char previousBracketType,
                                                       char closingBracketType) {

        if (previousBracketType == '(' && closingBracketType == ')') {
            return true;
        } else if (previousBracketType == '[' && closingBracketType == ']') {
            return true;
        } else if (previousBracketType == '{' && closingBracketType == '}') {
            return true;
        }

        return false;
    }

    private static void printExpressionInBrackets(int startPosition,
                                                  int endPosition, char[] charArr) {


        for (int j = startPosition; j <= endPosition; j++) {
            System.out.print(charArr[j]);
        }

        System.out.println();
    }
}
