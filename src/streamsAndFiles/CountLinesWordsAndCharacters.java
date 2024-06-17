package streamsAndFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesWordsAndCharacters {
    public static void main(String[] args) {

        File file = new File("src/resources/input.txt");

        int linesCount = 0;
        int wordsCount = 0;
        int charactersCount = 0;

        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {

            String line = bf.readLine();

            while (line != null) {

                linesCount++;
                wordsCount += line.split("\\s+").length;
                charactersCount += line.length();

                line = bf.readLine();

            }


        } catch (IOException exception) {

            System.out.println(exception.getMessage());
        }

        System.out.printf("Lines count: %d%n" +
                "Words count: %d%n" +
                "Characters count: %d%n", linesCount, wordsCount, charactersCount);

    }

}
