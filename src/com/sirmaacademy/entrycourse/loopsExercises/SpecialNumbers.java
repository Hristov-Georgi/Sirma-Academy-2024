package com.sirmaacademy.entrycourse.loopsExercises;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        for (int i = 1111; i <= 9999 ; i++) {
            boolean isNumberSpecial = true;

            int specialNum = i;
            for (int j = 1; j <= 4 ; j++) {

                int digit = specialNum % 10;

                if (digit == 0 || number % digit != 0) {
                    isNumberSpecial = false;
                    break;
                } else {
                    specialNum /= 10;
                }

            }

            if (isNumberSpecial) {
                System.out.println(i);

            }
        }

    }
}
