package streamsAndFiles;

import java.io.*;

public class ReverseLines {
    public static void main(String[] args){
        File readFrom = new File("src/resources/input.txt");
        File writeTo = new File("src/resources/output.txt");

        StringBuilder resultOutput = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(readFrom))) {

            String line = reader.readLine();

            while (line != null) {

                StringBuilder currentLine = new StringBuilder();

                currentLine.append(line);
                currentLine.reverse();
                resultOutput.append(currentLine);
                resultOutput.append(System.lineSeparator());

                line = reader.readLine();

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new PrintWriter(writeTo))) {

            writer.write(resultOutput.toString());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
