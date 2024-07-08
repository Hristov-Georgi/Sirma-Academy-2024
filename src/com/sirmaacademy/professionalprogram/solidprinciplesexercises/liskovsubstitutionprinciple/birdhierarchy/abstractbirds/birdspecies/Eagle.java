package com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.birdhierarchy.abstractbirds.birdspecies;

import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.birdhierarchy.abstractbirds.FlyingBird;

public class Eagle extends FlyingBird {

    @Override
    public void fly() {
        System.out.println("I can fly high.");
    }

}
