package com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.propulsionsystem.engines;

public class JetEngine implements Engine {

    @Override
    public void turnOn() {
        System.out.println("Engine uses air from one of three primary sources for start-up");
    }

}
