package com.sirmaacademy.entrycourse.loopsExercises;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {

            int number = 2 * i + 1;
            sum += number;

            System.out.println(number);

        }

        System.out.printf("Sum: %d%n", sum);

    }
}
