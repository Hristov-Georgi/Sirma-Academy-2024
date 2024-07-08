package com.sirmaacademy.professionalprogram.solidprinciplesexercises.dependencyinversionprinciple.weatherreporter;

public class ForecastApplication {
    public static void main(String[] args) {

        Sensor temperatureSensor = new TemperatureSensor();
        Sensor windSensor = new WindSensor();

        WeatherReporter weatherReporter = new WeatherReporter(temperatureSensor, windSensor);
        System.out.println(weatherReporter.report());
    }

}
