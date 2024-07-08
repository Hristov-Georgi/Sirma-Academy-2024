package com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.propulsionsystem.engines;

public class DieselEngine implements Engine{

    @Override
    public void turnOn() {
        System.out.println("Engine starts by compression");
    }

}
