package com.sirmaacademy.entrycourse.loopsExercises;

import java.util.Scanner;

public class PseudoFibonacciSequenceSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        if (n >= 1) {

            int firstNum = 0;
            int secondNum = 1;
            int fibonacciNum = 0;
            int sum = 1;


            for (int i = 1; i < n; i++) {

                fibonacciNum = firstNum + secondNum;
                sum += fibonacciNum;

                firstNum = secondNum;
                secondNum = fibonacciNum;

            }

            System.out.println(sum);


        } else if(n == 0) {

            System.out.println(0);

        } else {
            System.out.println("Invalid input");
        }


    }
}
