package com.sirmaacademy.entrycourse.arraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] productsArr = sc.nextLine().split(", ");

        Arrays.sort(productsArr);

        for (int i = 0; i < productsArr.length; i++) {

            System.out.printf("%d.%s%n", i + 1, productsArr[i]);
        }
    }
}
