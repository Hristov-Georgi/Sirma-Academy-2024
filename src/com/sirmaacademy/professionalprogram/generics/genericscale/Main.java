package com.sirmaacademy.professionalprogram.generics.genericscale;

public class Main {
    public static void main(String[] args) {

        int left = 2;
        int right = 2;

        Scale<Integer> scale = new Scale<>(left, right);

        Integer heavier = scale.getHeavier();

        System.out.println();
    }

}
