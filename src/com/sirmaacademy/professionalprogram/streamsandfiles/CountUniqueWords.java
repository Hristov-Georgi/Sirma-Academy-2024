package com.sirmaacademy.professionalprogram.streamsandfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountUniqueWords {
    public static void main(String[] args) {

        File file = new File("src/com/sirmaacademy/professionalprogram/streamsandfiles/resources/input.txt");
        Set<String> uniqueWordsSet = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line = reader.readLine();

            while (line != null) {

                uniqueWordsSet.addAll(Arrays.asList(line.split("[.*\\s+]+")));

                line = reader.readLine();
            }


        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Unique words: " + uniqueWordsSet.size());

    }

}
