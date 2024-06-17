package streamsAndFiles;

import java.io.*;

public class ExtractFile {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {

            File file = new File(reader.readLine());

            if (file.exists()) {
                String name = file.getName();
                int lastDot = name.lastIndexOf('.');

                System.out.printf("File name: %s%n", name.substring(0, lastDot));
                System.out.printf("File extension: %s%n", name.substring(lastDot + 1));
                System.out.printf("File size: %d bytes%n", file.length());

            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }

    }

}
