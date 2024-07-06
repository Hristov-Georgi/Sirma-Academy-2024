package com.sirmaacademy.entrycourse.conditionalStatementsTasks;

import java.util.Scanner;

public class ClimateZoneIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double latitude = Double.parseDouble(sc.nextLine());
        char hemisphere = sc.nextLine().charAt(0);

        if (hemisphere != 'S' && hemisphere != 'N') {
            System.out.println("Invalid hemisphere");
        } else {
            System.out.println(climateZone(latitude));
        }


    }

    private static String climateZone(double latitude) {
        String climateZone;

        if (latitude != 0 && latitude <= 90 && latitude >= -90) {

            if (Math.abs(latitude) <= 23.5) {
                climateZone = "Tropic zone";
            } else if (Math.abs(latitude) <= 66.5) {
                climateZone = "Temperate Zone";

            } else {
                climateZone = "Arctic zone";
            }

        } else if (latitude == 0) {
            climateZone = "Equator";

        } else {
            climateZone = "Latitude should be between -90 and 90 degrees.";
        }

        return climateZone;
    }
}
