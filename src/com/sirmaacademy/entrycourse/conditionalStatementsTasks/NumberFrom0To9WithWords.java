package com.sirmaacademy.entrycourse.conditionalStatementsTasks;

import java.util.Scanner;

public class NumberFrom0To9WithWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        boolean isInBounds = number >= 0 && number <= 9;
        boolean isEven = number % 2 == 0;

        String result = null;

        if (isInBounds && isEven) {

            switch (number) {
                case 0:
                    result = "zero";
                    break;
                case 2:
                    result = "two";
                    break;
                case 4:
                    result = "four";
                    break;
                case 6:
                    result = "six";
                    break;
                case 8:
                    result = "eight";
                    break;
            }

        } else if(isInBounds) {

            switch (number) {
                case 1:
                    result = "one";
                    break;
                case 3:
                    result = "three";
                    break;
                case 5:
                    result = "five";
                    break;
                case 7:
                    result = "seven";
                    break;
                case 9:
                    result = "nine";
                    break;
            }

        } else if (number > 9) {
            result = "too big";
        } else {
            result = "negative number";
        }

        System.out.println(result);
    }
}
