package com.sirmaacademy.entrycourse.conditionalStatementsTasks;

import java.util.Scanner;

public class AirlineLuggageCharges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = Double.parseDouble(sc.nextLine());
        double dimensions = Double.parseDouble(sc.nextLine());

        int extraCharge;
        if (weight > 50 && dimensions > 158 ) {
            int handlingFee = 50;
            int overweightCharge = 100;
            int dimensionFee = dimensionFee(dimensions);

            extraCharge = handlingFee + overweightCharge + dimensionFee;

            System.out.printf("$%d (Overweight + %s + Handling)", extraCharge, dimensionType(dimensions));

        } else if (weight > 50) {
            int overweightCharge = 100;

            extraCharge = overweightCharge;

            System.out.printf("$%d (Overweight)", extraCharge);

        } else if (dimensions > 158) {
            extraCharge = dimensionFee(dimensions) ;

            System.out.printf("$%d (%s)", extraCharge, dimensionType(dimensions));

        } else {
            System.out.println("No extra charges!");
        }


    }

    private static int dimensionFee (double dimensions) {
        int maxNoFeeDimension = 158;
        double exceedDimension = dimensions - maxNoFeeDimension;

        if (exceedDimension <= 20) {
            return 50;
        } else if (exceedDimension <= 50) {
            return 100;
        } else {
            return 200;
        }
    }

    private static String dimensionType(double dimensions) {
        int maxNoFeeDimension = 158;
        double exceedDimension = dimensions - maxNoFeeDimension;

        if (exceedDimension >= 1 && exceedDimension <=20) {
            return "Slightly oversize";
        } else {
            return "Oversize";
        }
    }
}
