package com.sirmaacademy.professionalprogram.streamsandfiles;

import java.io.*;

public class MergeLinesFromTwoFiles {
    public static void main(String[] args) throws IOException {

        File file1 = new File("src/com/sirmaacademy/professionalprogram/streamsandfiles/resources/input1.txt");
        File file2 = new File("src/com/sirmaacademy/professionalprogram/streamsandfiles/resources/input2.txt");

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2));
             BufferedWriter writer = new BufferedWriter(new PrintWriter("src/com/sirmaacademy/professionalprogram/streamsandfiles/resources/output.txt"))) {

            String firstLine = reader1.readLine();
            String secondLine = reader2.readLine();

            while (firstLine != null && secondLine != null) {

                writer.write(firstLine);
                writer.newLine();
                writer.write(secondLine);
                writer.newLine();

                firstLine = reader1.readLine();
                secondLine = reader2.readLine();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
