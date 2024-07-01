package generics.genericBox;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Box<Integer> box = new Box<>();


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int linesNum = Integer.parseInt(reader.readLine());

            while (linesNum-- > 0) {

                int data = Integer.parseInt(reader.readLine());

                box.setStorage(data);

            }


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(box);

    }

}
