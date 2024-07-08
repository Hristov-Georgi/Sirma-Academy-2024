package com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.vehicles;

import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.propulsionsystem.motors.Motor;

public class ElectricCar implements Vehicle {

    private Motor motor;

    public ElectricCar(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void run() {
        this.motor.start();
    }

    @Override
    public void accelerate() {
        System.out.println("I need electrical power.");
    }

}
