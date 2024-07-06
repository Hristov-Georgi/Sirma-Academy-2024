package com.sirmaacademy.professionalprogram.generics.customlist;

import java.io.*;

public class CommandInterpreter {
    public static void main(String[] args) {

        CustomList<String> myList = new MyCustomList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String line = reader.readLine();

            while (!line.equals("end")) {

                String[] commands = line.split("\\s+");

                switch (commands[0]) {

                    case "Add":
                        String element = commands[1];
                        myList.add(element);
                        break;

                    case "Remove":
                        int index = Integer.parseInt(commands[1]);
                        myList.remove(index);
                        break;

                    case "Contains":
                        String el = commands[1];
                        System.out.println(myList.contains(el));
                        break;

                    case "Swap":
                        int firstIndex = Integer.parseInt(commands[1]);
                        int secondIndex = Integer.parseInt(commands[2]);
                        myList.swap(firstIndex, secondIndex);
                        break;

                    case "Greater":
                        String elem = commands[1];
                        System.out.println(myList.countGreaterThan(elem));
                        break;

                    case "Max":
                        System.out.println(myList.getMax());
                        break;

                    case "Min":
                        System.out.println(myList.getMin());
                        break;

                    case "Print":
                        myList.printAllElements();
                        break;

                    default:
                        System.out.println("Invalid command: " + commands[0]);
                        break;
                }
                line = reader.readLine();
            }

        } catch (IndexOutOfBoundsException | NullPointerException | IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}