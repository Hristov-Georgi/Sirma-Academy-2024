package generics.genericBoxAndGenericSwapMethod;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
         * Stores read data.
         */
        Box<Integer> box = new Box<>();

        /*
         * Reads input data from console and stores it in the Box class instance.
         * Last reads int[] with two indexes which will be swapped.
         */
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int linesNum = Integer.parseInt(reader.readLine());

            while (linesNum-- > 0) {

                int data = Integer.parseInt(reader.readLine());

                box.setStorage(data);

            }

            int[] swapIndexes = Arrays.stream(reader.readLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            box.swap(swapIndexes);


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        /*
         * Print all stored data.
         */
        System.out.println(box);

    }

}
