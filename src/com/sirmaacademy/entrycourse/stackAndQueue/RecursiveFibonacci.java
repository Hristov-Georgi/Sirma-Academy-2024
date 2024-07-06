package com.sirmaacademy.entrycourse.stackAndQueue;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else if (1 < n && n <= 49) {

            int firstNum = 0;
            int secondNum = 1;

            int iterations = 2;

            getFibonacci(firstNum, secondNum, iterations, n);
        }

    }

    private static void getFibonacci(int firstNum, int secondNum, int iterations, int n) {

        if (iterations != n) {

            int result = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = result;
            iterations++;

            getFibonacci(firstNum, secondNum, iterations, n);

        } else {
            System.out.println(firstNum + secondNum);

        }

    }

}
