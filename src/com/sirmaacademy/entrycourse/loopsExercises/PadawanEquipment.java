package com.sirmaacademy.entrycourse.loopsExercises;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double moneyAmount = Double.parseDouble(sc.nextLine());
        int studentsCount = Integer.parseInt(sc.nextLine());
        double lightSaberPrice = Double.parseDouble(sc.nextLine());
        double robePrice = Double.parseDouble(sc.nextLine());
        double beltPrice = Double.parseDouble(sc.nextLine());

        int freeBelts = 0;
        if (studentsCount % 6 == 0) {
            freeBelts = studentsCount / 6;
        }

        double extraPercentageLightSaber = 0.1;
        double extraLightSabers = Math.ceil(studentsCount * extraPercentageLightSaber);

        double totalPrice =((studentsCount + extraLightSabers) * lightSaberPrice) +
                (studentsCount * robePrice) + ((studentsCount - freeBelts) * beltPrice);

        if (totalPrice > moneyAmount) {
            System.out.printf("George Lucas will need %.2flv more.%n", totalPrice - moneyAmount);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.%n", totalPrice);
        }

    }
}
