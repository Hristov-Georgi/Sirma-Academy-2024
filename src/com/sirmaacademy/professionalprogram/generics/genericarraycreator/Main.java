package com.sirmaacademy.professionalprogram.generics.genericarraycreator;

public class Main {
    public static void main(String[] args) {

        int intItem = 10;
        int length = 5;
        String strItem = "word";

        Integer[] intArray = ArrayCreator.create(length, intItem);

        String[] strArray = ArrayCreator.create(String.class, length, strItem);

    }
}
