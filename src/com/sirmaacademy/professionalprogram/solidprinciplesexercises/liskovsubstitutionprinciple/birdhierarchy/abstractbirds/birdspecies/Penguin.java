package com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.birdhierarchy.abstractbirds.birdspecies;

import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.birdhierarchy.abstractbirds.SwimmingBird;

public class Penguin extends SwimmingBird {

    @Override
    public void swim() {
        System.out.println("I am living torpedo in the water.");
    }

}
