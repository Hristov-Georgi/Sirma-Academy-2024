package streamsAndFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReplaceWord {
    public static void main(String[] args) {

        File file = new File("src/resources/input.txt");

        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {

            String replacement = bf.readLine();
            String text = bf.readLine();

            while (replacement != null && text != null ) {

                String wordToReplace = replacement.split("\\s+->\\s+")[0];
                String newWord = replacement.split("\\s+->\\s+")[1];

                System.out.println(text.replace(wordToReplace, newWord).trim());

                replacement = bf.readLine();
                text = bf.readLine();
            }


        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }


    }
}
