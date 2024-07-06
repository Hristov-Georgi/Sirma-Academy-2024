package com.sirmaacademy.professionalprogram.streamsandfiles;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args){

        File file = new File("src/com/sirmaacademy/professionalprogram/streamsandfiles/resources/resources/input.txt");

        Map<Character, Integer> charMap = new LinkedHashMap<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {

            int currentChar = bf.read();

            while (currentChar != -1) {

                char symbol = (char) currentChar;

                if (charMap.containsKey(symbol)) {
                    charMap.put(symbol, charMap.get(symbol) + 1);
                } else {
                    charMap.put(symbol, 1);
                }

                currentChar = bf.read();

            }

        } catch (IOException exception) {

            System.out.println(exception.getMessage());

        }

        for (Map.Entry<Character, Integer> m : charMap.entrySet()) {

            System.out.printf("%c: %d%n", m.getKey(), m.getValue());
        }

    }

}
