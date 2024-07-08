package com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.vehicles;

import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.propulsionsystem.engines.Engine;

public class DieselCar implements Vehicle {

    private Engine engine;

    public DieselCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void run() {
        this.engine.turnOn();
    }

    @Override
    public void accelerate() {
        System.out.println("Feed engine with diesel fuel.");
    }

}
