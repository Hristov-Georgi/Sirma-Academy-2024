package com.sirmaacademy.entrycourse.loopsExercises;

import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        int number = Integer.parseInt(n);
        int power = n.length();
        double armstrongNumber = 0;

        while (number > 0) {

            armstrongNumber +=  Math.pow(number % 10, power);

            number /= 10;

        }

        if(Integer.parseInt(n) == armstrongNumber) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }
}
