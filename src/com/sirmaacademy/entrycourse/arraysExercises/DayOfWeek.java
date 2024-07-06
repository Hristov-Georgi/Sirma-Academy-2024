package com.sirmaacademy.entrycourse.arraysExercises;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daysOfWeekArr = {"Monday",
                                    "Tuesday",
                                    "Wednesday",
                                    "Thursday",
                                    "Friday",
                                    "Saturday",
                                    "Sunday"};

        int dayNum = Integer.parseInt(sc.nextLine());

        if (1 <= dayNum && dayNum <= 7) {
            System.out.println(daysOfWeekArr[dayNum - 1]);
        } else {
            System.out.println("Invalid day!");
        }

    }

}
