package com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.birdhierarchy.abstractbirds;


public abstract class FlyingBird extends Bird{

    public void fly(){
        System.out.println("Flying at average altitude.");
    }

}
