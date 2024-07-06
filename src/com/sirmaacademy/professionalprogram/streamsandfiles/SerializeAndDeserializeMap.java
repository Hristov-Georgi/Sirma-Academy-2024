package com.sirmaacademy.professionalprogram.streamsandfiles;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class SerializeAndDeserializeMap {
    public static void main(String[] args) {

        Map<String, Integer> namesAgesMap = new HashMap<>();
        namesAgesMap.put("Ivan", 25);
        namesAgesMap.put("Kiril", 55);
        namesAgesMap.put("Tosho", 35);
        namesAgesMap.put("Svilen", 15);

        Map<String, Integer> deserializedMap = new HashMap<>();

        File file = new File("src/com/sirmaacademy/professionalprogram/streamsandfiles/resources/map.ser");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            objectOutputStream.writeObject(namesAgesMap);

            deserializedMap = (Map<String, Integer>) objectInputStream.readObject();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
