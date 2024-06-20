package streamsAndFiles;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;



public class ExtractSpecificFilesFromZipArchive {
    public static void main(String[] args) throws IOException {

        File textFilesDir = new File("src/resources/extracted_files/");
        boolean isCreated = textFilesDir.mkdirs();

        Path zipFilePath = Path.of("src/resources/test.zip");

        extractTextFiles(zipFilePath, textFilesDir);

    }

    private static void extractTextFiles(Path zipFilePath, File textFilesDir) {

        try (ZipInputStream zipInputStream = new ZipInputStream(Files.newInputStream(zipFilePath))) {

            ZipEntry zipEntry = zipInputStream.getNextEntry();

            while (zipEntry != null) {

                int backSlashIndex = zipEntry.getName().lastIndexOf('/');
                String fileName = zipEntry.getName().substring(backSlashIndex + 1);

                if (fileName.endsWith(".txt")) {

                    transferTextFiles(fileName, textFilesDir, zipInputStream);

                }

                zipEntry = zipInputStream.getNextEntry();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void transferTextFiles(String fileName, File textFilesDir, ZipInputStream zipInputStream) {

        File currentFilePath = new File(textFilesDir, fileName);

        try (BufferedOutputStream bufferedOutputStream =
                     new BufferedOutputStream(new FileOutputStream(currentFilePath))) {

            zipInputStream.transferTo(bufferedOutputStream);

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }

    }

}
