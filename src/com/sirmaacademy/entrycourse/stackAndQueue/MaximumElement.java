package com.sirmaacademy.entrycourse.stackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int numberOfCommands = Integer.parseInt(sc.nextLine());

        if (1 <= numberOfCommands && numberOfCommands <= Math.pow(10,5)) {
            executeStackOperations(numberOfCommands);
        }


    }

    private static void executeStackOperations(int numberOfCommands) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numberOfCommands; i++) {

            String command = sc.nextLine();
            int commandNumber = Integer.parseInt(command.split("\\s+")[0]);

            if (1 <= commandNumber && commandNumber <= 3) {

                switch (commandNumber) {

                    case 1:   //Push

                        int number = Integer.parseInt(command.split("\\s+")[1]);

                        if (1 <= number && number <= Math.pow(10, 9)) {
                            stack.push(number);
                        }

                        break;

                    case 2:     //Delete

                        stack.pop();

                        break;

                    case 3:     // Print

                        if (!stack.isEmpty()) {
                            System.out.println(findMaxElement(stack));
                        }

                        break;


                }

            }

        }

    }

    private static int findMaxElement(ArrayDeque<Integer> stack) {
        int previous = 0;

        for (int n : stack) {

            if (previous <= n) {
                previous = n;
            }

        }

        return previous;

    }
}
