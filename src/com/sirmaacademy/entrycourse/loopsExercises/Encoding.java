package com.sirmaacademy.entrycourse.loopsExercises;

import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        while (n > 0) {

            int lastDigit = n % 10;
            int symbol = lastDigit + 33;

            if (lastDigit == 0) {
                System.out.print("ZERO");

            } else {

                for (int i = 0; i < lastDigit; i++) {

                    System.out.print((char) symbol);

                }
            }

            System.out.println();

            n /= 10;
        }
    }
}
