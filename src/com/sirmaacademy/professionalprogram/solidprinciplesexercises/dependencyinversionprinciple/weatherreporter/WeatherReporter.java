package com.sirmaacademy.professionalprogram.solidprinciplesexercises.dependencyinversionprinciple.weatherreporter;

import java.time.LocalDate;

public class WeatherReporter {

    private final Sensor temperatureSensor;
    private final Sensor windSensor;

    public WeatherReporter(Sensor temperatureSensor, Sensor windSensor) {
        this.temperatureSensor = temperatureSensor;
        this.windSensor = windSensor;
    }

    public String report() {
        return String.format("Weather forecast for " + LocalDate.now() + " is%n" +
                "Current temperature: %.2f °C%n" +
                "Current wind speed: %.2f m/s%n",
                this.temperatureSensor.getTemperature(),
                this.windSensor.getWindSpeedMetersPerSecond());
    }

}
