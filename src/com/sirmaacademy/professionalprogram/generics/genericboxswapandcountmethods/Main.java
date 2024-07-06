package com.sirmaacademy.professionalprogram.generics.genericboxswapandcountmethods;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        /*
         * Stores read data.
         */
        Box<String> box = new Box<>();

        /*
         * Reads input data from console and stores it in the Box class instance.
         * Last reads int[] with two indexes which will be swapped.
         */
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int linesNum = Integer.parseInt(reader.readLine());

            while (linesNum-- > 0) {

                //int data = Integer.parseInt(reader.readLine());
                String data = reader.readLine();

                box.setStorage(data);

            }

            String lastValue = reader.readLine();

            //box.swap(lastValue);
            System.out.println(box.countGreaterElements(lastValue));

        } catch (NumberFormatException | IOException ex) {
            System.out.println(ex.getMessage());
        }

        /*
         * Print all stored data.
         */
        //System.out.println(box);



    }

}
