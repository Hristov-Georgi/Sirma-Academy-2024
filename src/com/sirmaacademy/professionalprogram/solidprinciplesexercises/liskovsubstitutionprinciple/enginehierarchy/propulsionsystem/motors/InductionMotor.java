package com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.propulsionsystem.motors;

public class InductionMotor implements Motor {

    @Override
    public void start() {
        System.out.println("It starts with the battery in the car that is connected to the motor");
    }

}
