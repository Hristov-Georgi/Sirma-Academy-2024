package com.sirmaacademy.entrycourse.methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        validatePassword(password);

    }

    private static void validatePassword(String password) {

        if (validateLength(password) &&
            isConsistOnlyLettersAndDigits(password) &&
            haveAtLeastTwoDigits(password)) {

            System.out.println("Password is valid");

        }

        if (!validateLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!isConsistOnlyLettersAndDigits(password)) {
            System.out.println("Password must contain only letters and digits");
        }

        if (!haveAtLeastTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }


    }

    private static boolean validateLength(String password) {

        return 6 <= password.length() && password.length() <= 10;

    }

    private static boolean isConsistOnlyLettersAndDigits(String password) {

        for (char s : password.toCharArray()) {

            if ( s <= 47 ||
               (58 <= s && s <= 64) ||
                (91 <= s && s <= 96) ||
                123 <= s) {

                return false;

            }

        }

        return true;
    }

    private static boolean haveAtLeastTwoDigits(String password) {

        int digitsCount = 0;

        for (char s : password.toCharArray()) {

            if (48 <= s && s <= 57) {
                digitsCount++;
            }

            if (digitsCount >= 2) {
                return true;
            }

        }

        return false;
    }

}
