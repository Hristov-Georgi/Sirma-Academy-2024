package streamsAndFiles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WordLengths {

    public static void main(String[] args) throws IOException {

        File file = new File("src/resources/input.txt");

        List<Integer> wordsLength = new ArrayList<>();

        try ( BufferedReader reader = new BufferedReader(new FileReader(file));) {

            String text = reader.readLine();

            while (text != null) {

                for (String w : text.split("\\s+")) {
                    wordsLength.add(w.length());
                }

                text = reader.readLine();
            }

        }

        System.out.println(wordsLength.toString().replace("[", "")
                .replace("]", ""));


    }
}
