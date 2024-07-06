package com.sirmaacademy.entrycourse.methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number = Double.parseDouble(sc.nextLine());
        int power = Integer.parseInt(sc.nextLine());

        DecimalFormat df = new DecimalFormat("0.#############");
        System.out.println(df.format(calculateNumberRisenToPower(number, power)));
    }

    private static double calculateNumberRisenToPower(double number, int power) {
        return Math.pow(number, power);
    }
}
