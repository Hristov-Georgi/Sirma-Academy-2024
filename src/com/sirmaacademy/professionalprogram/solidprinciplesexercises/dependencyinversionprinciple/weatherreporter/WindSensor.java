package com.sirmaacademy.professionalprogram.solidprinciplesexercises.dependencyinversionprinciple.weatherreporter;

import java.util.Random;

public class WindSensor extends Sensor{

    @Override
    Double getWindSpeedMetersPerSecond() {
        Random rnd = new Random();
        double maxValue = 200.01;

        return rnd.nextDouble(maxValue);
    }
}
