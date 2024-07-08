package com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.birdhierarchy;

import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.birdhierarchy.abstractbirds.Bird;
import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.birdhierarchy.abstractbirds.FlyingBird;
import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.birdhierarchy.abstractbirds.birdspecies.Eagle;
import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.birdhierarchy.abstractbirds.birdspecies.Kakapo;
import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.birdhierarchy.abstractbirds.birdspecies.Penguin;

public class BirdApplication {
    public static void main(String[] args) {

        Bird kakapo = new Kakapo();
        FlyingBird eagle = new Eagle();
        Penguin penguin = new Penguin();

        kakapo.walk();
        eagle.fly();
        penguin.swim();

        getBird(kakapo);
        System.out.println("------------------");
        getBird(eagle);
        System.out.println("------------------");
        getBird(penguin);
    }

    private static void getBird(Bird bird) {
        System.out.println("Get that bird");
    }

}
