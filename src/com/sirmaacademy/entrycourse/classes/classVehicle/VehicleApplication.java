package com.sirmaacademy.entrycourse.classes.classVehicle;

import java.util.Scanner;

public class VehicleApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Engine engine = new Engine(100);
        Vehicle vehicle = new Vehicle("a", "b", engine, 200);

        vehicle.drive(100);
        System.out.println(vehicle.getFuel());

//        Engine engine = null;
//        Vehicle vehicle = null;
//
//        String input = sc.nextLine();
//
//        while (!input.isBlank()) {
//
//            String[] inputData = input.split("\\s+");
//
//            if (inputData.length > 1) {
//
//                if (inputData[0].equals("Engine")) {
//                    int horsePower = Integer.parseInt(inputData[inputData.length - 1]);
//
//                    engine = createEngine(horsePower);
//
//                } else if (inputData[0].equals("Vehicle") ||
//                        inputData[1].equals("vehicle")) {
//
//                    String[] vehicleInfo = input.split("\\(");
//
//                   vehicle = createVehicle(vehicleInfo, engine);
//
//                }
//
//            } else if (inputData.length == 1 && vehicle != null){
//
//                String[] methodData = input.split("\\.");
//
//                if (methodData[0].equals("vehicle")) {
//                    String[] methodNameAndParameters = methodData[1].split("\\(");
//
//                    driveVehicle(methodNameAndParameters, vehicle);
//
//                } else if (methodData[0].split("\\(")[0].equals("print")){
//
//                    String fieldName = methodData[1].split("\\)")[0];
//
//                    printRequiredVehicleProperty(fieldName, vehicle);
//
//                }
//
//            }
//
//           input = sc.nextLine();
//
        }

    }
//
//    private static void printRequiredVehicleProperty(String fieldName, Vehicle vehicle) {
//
//        switch (fieldName) {
//
//            case "type":
//                System.out.print(vehicle.getType());
//                break;
//
//            case "model":
//                System.out.print(vehicle.getModel());
//
//                break;
//
//            case "engine":
//                System.out.print(vehicle.getEngine().getPower());
//
//                break;
//
//            case "fuel":
//                System.out.print(vehicle.getFuel());
//
//                break;
//        }
//
//    }
//
//    private static void driveVehicle(String[] methodNameAndParameters, Vehicle vehicle) {
//
//        if(methodNameAndParameters[0].equals("drive")) {
//            int fuelLoss = Integer.parseInt(methodNameAndParameters[1].split("\\)")[0]);
//
//            vehicle.drive(fuelLoss);
//        }
//    }
//
//    private static Vehicle createVehicle(String[] vehicleInfo, Engine engine) {
//        String[] vehicleData = vehicleInfo[1].split(",");
//
//        String type = vehicleData[0];
//        String model = vehicleData[1];
//        int fuel = Integer.parseInt(vehicleData[3].split("\\)")[0]);
//
//       return new Vehicle(type, model, engine, fuel);
//    }
//
//    private static Engine createEngine(int horsePower) {
//
//        return new Engine(horsePower);
//    }
//}
