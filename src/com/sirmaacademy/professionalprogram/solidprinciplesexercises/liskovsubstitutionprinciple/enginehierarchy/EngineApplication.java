package com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy;

import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.propulsionsystem.engines.DieselEngine;
import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.propulsionsystem.engines.Engine;
import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.propulsionsystem.engines.JetEngine;
import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.propulsionsystem.motors.InductionMotor;
import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.propulsionsystem.motors.Motor;
import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.vehicles.DieselCar;
import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.vehicles.ElectricCar;
import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.vehicles.JumboJet;
import com.sirmaacademy.professionalprogram.solidprinciplesexercises.liskovsubstitutionprinciple.enginehierarchy.vehicles.Vehicle;

public class EngineApplication {
    public static void main(String[] args) {

        Engine dieselEngine = new DieselEngine();
        Engine jetEngine = new JetEngine();
        Motor inductionMotor = new InductionMotor();

        Vehicle dieselCar = new DieselCar(dieselEngine);
        Vehicle jumboJet = new JumboJet(jetEngine);
        Vehicle electricCar = new ElectricCar(inductionMotor);

        dieselCar.run();
        dieselCar.accelerate();
        System.out.println("-----------------------");
        jumboJet.run();
        jumboJet.accelerate();
        System.out.println("-----------------------");
        electricCar.run();
        electricCar.accelerate();


    }

}
