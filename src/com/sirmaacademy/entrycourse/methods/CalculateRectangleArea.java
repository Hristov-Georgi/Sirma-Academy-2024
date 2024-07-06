package com.sirmaacademy.entrycourse.methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());

        printArea(width, length);

    }

    private static void printArea(int width, int length) {

        Integer result = calculateRectangleOrSquareArea(width, length);

        System.out.println(result);

    }

    private static Integer calculateRectangleOrSquareArea(int sideA, int sideB) {
        return sideA * sideB;
    }
}
