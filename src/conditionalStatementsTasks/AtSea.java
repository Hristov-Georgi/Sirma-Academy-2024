package conditionalStatementsTasks;

import java.util.Scanner;

public class AtSea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int daysToStay = Integer.parseInt(sc.nextLine());
        String roomType = sc.nextLine();
        String assessment = sc.nextLine();

        if (!validateInput(daysToStay, roomType, assessment)) {
            System.out.println("Invalid input");
            return;
        }

        System.out.printf("%.2f", priceForStay(daysToStay, roomType, assessment));


    }

    private static double priceForStay(int daysToStay, String roomType, String assessment) {
        int overnightStay = daysToStay - 1;
        double priceForStay = 0.0;

        switch (roomType) {
            case "single room":
                double singleRoomPricePerNight = 25.00;

                if(assessment.equals("positive")) {
                    priceForStay =  totalPricePositiveAssessment(overnightStay, singleRoomPricePerNight);
                } else {
                    priceForStay = totalPriceNegativeAssessment(overnightStay, singleRoomPricePerNight);
                }

                break;

            case "apartment":
                double apartmentPricePerNight = 50.00;
                double apartmDisc = apartmentDiscount(daysToStay);

                if(assessment.equals("positive")) {
                    priceForStay =  totalPricePositiveAssessment(overnightStay, apartmentPricePerNight, apartmDisc);
                } else {
                    priceForStay = totalPriceNegativeAssessment(overnightStay, apartmentPricePerNight, apartmDisc);
                }

                break;
            case "presidential":
                double presidentialPricePerNight = 100.00;
                double presidDisc = presidentialDiscount(daysToStay);

                if(assessment.equals("positive")) {
                    priceForStay =  totalPricePositiveAssessment(overnightStay, presidentialPricePerNight, presidDisc);
                } else {
                    priceForStay = totalPriceNegativeAssessment(overnightStay, presidentialPricePerNight, presidDisc);
                }

                break;
        }

        return priceForStay;
    }

    private static double totalPriceNegativeAssessment(int overnightStay, double pricePerNight, double discount) {
        double assessment = 0.1; //deduct 10% from the price

        double sumWithDiscount =  (overnightStay * pricePerNight) - (overnightStay * pricePerNight * discount);
        return sumWithDiscount * (1 - assessment);
    }

    private static double totalPriceNegativeAssessment(int overnightStay, double pricePerNight) {
        double assessment = 0.1; //deduct 10% from the price

        return (overnightStay * pricePerNight) * (1 - assessment);
    }

    private static double totalPricePositiveAssessment(int overnightStay, double pricePerNight, double discount) {
        double assessment = 0.25; //add 25% to the already deducted price
        double sumWithDiscount =  (overnightStay * pricePerNight) - (overnightStay * pricePerNight * discount);
        return sumWithDiscount * (1 + assessment);
    }

    private static double totalPricePositiveAssessment(int overnightStay, double pricePerNight) {
        double assessment = 0.25; //add 25% to the already deducted price
        return  overnightStay * pricePerNight * (1 + assessment);
    }

    private static double presidentialDiscount(int daysToStay) {

        double discount;
        if (daysToStay < 10) {
            discount = 0.1;
        } else if (daysToStay < 15) {
            discount = 0.15;
        } else {
            discount = 0.2;
        }

        return discount;
    }

    private static double apartmentDiscount(int daysToStay) {

        double discount;
        if (daysToStay < 10) {
            discount = 0.3;
        } else if (daysToStay < 15) {
            discount = 0.35;
        } else {
            discount = 0.5;
        }

        return discount;
    }

    private static boolean validateInput(int daysToStay, String roomType, String assessment) {

        return daysToStay > 0 && daysToStay <= 365 &&
                (roomType.equals("single room") || roomType.equals("apartment") || roomType.equals("presidential")) &&
                (assessment.equals("positive") || assessment.equals("negative"));
    }
}
