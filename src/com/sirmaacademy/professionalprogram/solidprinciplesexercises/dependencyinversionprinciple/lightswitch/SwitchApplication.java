package com.sirmaacademy.professionalprogram.solidprinciplesexercises.dependencyinversionprinciple.lightswitch;

public class SwitchApplication {
    public static void main(String[] args) {

        Bulb standardBulb = new Bulb();
        FancyBulb fancyBulb = new FancyBulb();

        Switch standardButton = new LightSwitch(standardBulb);
        Switch fancyButton = new LightSwitch(fancyBulb);

        standardButton.operate();
        standardButton.operate();
        standardButton.operate();

        fancyButton.operate();
        fancyButton.operate();
        fancyButton.operate();
        fancyButton.operate();
    }
}
