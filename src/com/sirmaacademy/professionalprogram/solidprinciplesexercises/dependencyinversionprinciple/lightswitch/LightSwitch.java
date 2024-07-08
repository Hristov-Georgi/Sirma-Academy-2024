package com.sirmaacademy.professionalprogram.solidprinciplesexercises.dependencyinversionprinciple.lightswitch;

public class LightSwitch implements Switch{

    private final EnergyDevice energyDevice;

    public LightSwitch(EnergyDevice energyDevice) {
        this.energyDevice = energyDevice;
    }

    @Override
    public void operate() {

        if (energyDevice.isOn()) {
            energyDevice.turnOff();
        } else {
            energyDevice.turnOn();
        }

    }

}
