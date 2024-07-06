package com.sirmaacademy.professionalprogram.streamsandfiles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeCustomObjectList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("src/com/sirmaacademy/professionalprogram/streamsandfiles/resources/persons.ser");
        boolean fileStatus = file.createNewFile();

        List<Person> personList = new ArrayList<>();
        fillPersonList(personList);

        List<Person> readPersonStream = new ArrayList<>();

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            objectOutputStream.writeObject(personList);

            readPersonStream = (List<Person>) objectInputStream.readObject();

        }

    }

    private static void fillPersonList(List<Person> personList) {

        personList.add(new Person("Ivan", 23));
        personList.add(new Person("Gosho", 30));
        personList.add(new Person("Pesho", 33));
        personList.add(new Person("Kiro", 13));
    }

}
