package com.sirmaacademy.entrycourse.loopsExercises;

import java.util.Scanner;

public class NumbersNTo0ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        for (int i = N; i >= 1 ; i--) {
            System.out.println(i);
        }
    }
}
