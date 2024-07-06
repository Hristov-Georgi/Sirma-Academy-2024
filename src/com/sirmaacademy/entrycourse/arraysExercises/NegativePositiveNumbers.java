package com.sirmaacademy.entrycourse.arraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class NegativePositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] elementsArr = Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 1; i <= elementsArr.length -1; i++) {
            int previousNum = elementsArr[i -1];

            if (0 <= previousNum && elementsArr[i] < 0) {

                for (int j = i; j > 0; j--) {
                    int currentNum = elementsArr[j];
                    elementsArr[j] = elementsArr[j-1];
                    elementsArr[j-1] = currentNum;
                }

            }

        }

        for (int n : elementsArr) {
            System.out.println(n);
        }
    }
}
