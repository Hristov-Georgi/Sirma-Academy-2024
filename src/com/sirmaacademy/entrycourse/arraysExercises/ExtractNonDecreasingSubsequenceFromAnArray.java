package com.sirmaacademy.entrycourse.arraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ExtractNonDecreasingSubsequenceFromAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String result = "";

        int currentNumber = 0;
        for (int n : numbersArr) {

            if (currentNumber <= n) {
                currentNumber = n;
                result += currentNumber + " ";
            }

        }

        System.out.println(result.trim());

    }

}
