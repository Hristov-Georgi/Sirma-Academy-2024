package com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.birdhierarchy.abstractbirds;

public abstract class Bird {

    public void eat() {
        System.out.println("peck peck peck");
    }

    public void walk() {
        System.out.println("Walking down the streets.");
    }

}
