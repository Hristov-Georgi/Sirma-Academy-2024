package com.sirmaacademy.professionalprogram.streamsandfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CalculateDirectorySize {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String inputPath = reader.readLine();
            System.out.println("Total size: " + calculateDirectorySize(inputPath));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static BigInteger calculateDirectorySize(String inputPath) {
        BigInteger size = BigInteger.valueOf(0L);

        File file = new File(inputPath);

        File[] filesArr = file.listFiles();

        assert filesArr != null;
        for (File f : filesArr) {

            if (!f.isDirectory()) {
                size = size.add(BigInteger.valueOf(f.length()));

            } else {
                 size = size.add(calculateDirectorySize(f.getAbsolutePath()));
            }

        }

        return size;
    }

}
