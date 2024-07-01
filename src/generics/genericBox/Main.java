package generics.genericBox;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        /*
         * Stores read data.
         */
        Box<Integer> box = new Box<>();

        /*
         * Reads input data from console and stores it in the Box class instance.
         */
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int linesNum = Integer.parseInt(reader.readLine());

            while (linesNum-- > 0) {

                int data = Integer.parseInt(reader.readLine());

                box.setStorage(data);

            }


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        /*
         * Print all stored data.
         */
        System.out.println(box);

    }

}
