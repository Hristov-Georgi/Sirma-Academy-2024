package com.sirmaacademy.professionalprogram.solidprinciplesexercises.openclosedprinciple.loggerclass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger{

    private String message;
    private String fileName;

    public FileLogger(String message, String fileName) {
        this.message = message;
        this.fileName = fileName;
    }

    @Override
    public void log() {
        File file = new File(this.fileName);

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(message);

        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
