package com.sirmaacademy.professionalprogram.solidprinciplesexercises.openclosedprinciple.discountcalculatorclass;

public class DiscountCalculatorApplication {
    public static void main(String[] args) {

        DiscountCalculator discountCalculator = DiscountCalculator.getInstance();

        System.out.printf("%.2f%n", discountCalculator.calculateDiscount("student", 30));

    }

}
