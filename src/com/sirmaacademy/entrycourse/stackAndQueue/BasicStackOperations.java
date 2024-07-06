package com.sirmaacademy.entrycourse.stackAndQueue;

import java.util.*;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nsxNumbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int nElementsCountToPush = nsxNumbers[0];
        int sElementsCountToPop = nsxNumbers[1];
        int xSearchedElement = nsxNumbers[2];

        int[] numbersArr = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stack = pushNElementsToStack(numbersArr, nElementsCountToPush);

        removeSElementsFromStack(stack, sElementsCountToPop);

        printIfNumberExistOrSmallestNumberInStack(stack, xSearchedElement);





    }

    private static void printIfNumberExistOrSmallestNumberInStack(ArrayDeque<Integer> stack, int xSearchedNumber) {

        if(stack.isEmpty()) {
            System.out.println(0);
        } else if (isXNumberPresentInStack(stack, xSearchedNumber)) {
            System.out.println("true");
        } else {

            System.out.println(getStackSmallestElement(stack));
        }

    }

    private static int getStackSmallestElement(ArrayDeque<Integer> stack) {
        int smallestElement = stack.pop();

        while (!stack.isEmpty()) {

            if (stack.peek() < smallestElement) {
                smallestElement = stack.pop();
            } else {
                stack.pop();
            }

        }

        return smallestElement;
    }

    private static boolean isXNumberPresentInStack(ArrayDeque<Integer> stack, int xElement) {

        return stack.contains(xElement);
    }

    private static void removeSElementsFromStack(ArrayDeque<Integer> stack, int sElementsCount) {

        for (int i = 0; i < sElementsCount; i++) {
            stack.pop();
        }

    }

    private static ArrayDeque<Integer> pushNElementsToStack(int[] elementsArr, int nElementsCount) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < nElementsCount; i++) {

            stack.push(elementsArr[i]);
        }

        return stack;
    }
}
