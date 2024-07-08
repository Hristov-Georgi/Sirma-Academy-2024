package com.sirmaacademy.professionalprogram.solidprinciplesexercises.dependencyinversionprinciple.weatherreporter;

import java.util.Random;

public class TemperatureSensor extends Sensor{

    @Override
    Double getTemperature() {
        Random rnd = new Random();
        double minValue = -100.00;
        double maxValue = 200.01;

        return rnd.nextDouble(minValue, maxValue);
    }

}
