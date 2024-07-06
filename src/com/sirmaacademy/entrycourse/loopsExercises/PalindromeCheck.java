package com.sirmaacademy.entrycourse.loopsExercises;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String reversedText = "";

        for (int i = text.length() -1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }

        System.out.println(text.equals(reversedText));
    }
}
