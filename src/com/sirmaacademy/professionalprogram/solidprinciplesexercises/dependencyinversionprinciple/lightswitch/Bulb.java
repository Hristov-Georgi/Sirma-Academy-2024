package com.sirmaacademy.professionalprogram.solidprinciplesexercises.dependencyinversionprinciple.lightswitch;

public class Bulb implements EnergyDevice {

    private boolean isOn = false;

    @Override
    public void turnOn() {
        if (!this.isOn) {
            this.isOn = true;
            System.out.println("It is light");
        }

    }

    @Override
    public void turnOff() {
        if (this.isOn) {
            this.isOn = false;
            System.out.println("It is dark");
        }

    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

}
