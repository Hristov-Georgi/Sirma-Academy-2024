package com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.vehicles;

import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.propulsionsystem.engines.Engine;

public class JumboJet implements Vehicle{

    private Engine engine;

    public JumboJet(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void run() {
        this.engine.turnOn();
    }

    @Override
    public void accelerate() {
        System.out.println("Feed engine with jet fuel and compressed air.");
    }

}
