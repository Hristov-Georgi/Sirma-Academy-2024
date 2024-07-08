package com.sirmaacademy.professionalprogram.solidprinciplesexercises.openclosedprinciple.discountcalculatorclass;

public enum DiscountType {
    STUDENT(0.1),
    SENIOR(0.2);

    private final double discount;

    DiscountType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return this.discount;
    }

}
