package com.sirmaacademy.professionalprogram.solidprinciplesexercises.dependencyinversionprinciple.lightswitch;

public class FancyBulb implements EnergyDevice{

    private boolean isOn = false;

    @Override
    public void turnOn() {
        if (!this.isOn) {
            this.isOn = true;
            System.out.println("I am shining red.");
        }
    }

    @Override
    public void turnOff() {
        if (this.isOn) {
            this.isOn = false;
            System.out.println("I am not shining.");
        }
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }
}
