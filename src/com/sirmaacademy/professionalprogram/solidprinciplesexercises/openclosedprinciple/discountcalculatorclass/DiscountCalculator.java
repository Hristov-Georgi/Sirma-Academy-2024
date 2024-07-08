package com.sirmaacademy.professionalprogram.solidprinciplesexercises.openclosedprinciple.discountcalculatorclass;

public class DiscountCalculator {
    private static DiscountCalculator singleInstance = null;

    private DiscountCalculator() {
    }

    public static synchronized DiscountCalculator getInstance() {

        if (singleInstance == null) {
            singleInstance = new DiscountCalculator();
        }
        return singleInstance;
    }

    public double calculateDiscount(String type, double price) {
        double discount = getDiscountValue(type);

        return  price * (1 - discount);
    }

    private double getDiscountValue(String type) {
        double discount = 0.0;

        for (DiscountType d : DiscountType.values()) {

            if (d.name().equals(type.toUpperCase())) {
                discount = d.getDiscount();
                break;
            }

        }
        return discount;
    }


}
