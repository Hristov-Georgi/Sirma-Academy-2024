package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        receiveFilesAndCommands(printerQueue);

        printFiles(printerQueue);

    }

    private static void receiveFilesAndCommands(ArrayDeque<String> printerQueue) {

        String input = sc.nextLine();

        while (!input.equals("print")) {

            if (!input.equals("cancel")) {
                printerQueue.offer(input);
            }

            if (input.equals("cancel") && !printerQueue.isEmpty()) {
                System.out.printf("Canceled %s%n", printerQueue.pollFirst());

            } else if (input.equals("cancel")) {
                System.out.println("Standby");
            }

            input = sc.nextLine();
        }

    }

    private static void printFiles(ArrayDeque<String> printerFiles) {

        if (!printerFiles.isEmpty()) {

            for (String f : printerFiles) {
                System.out.println(f);
            }

        }

    }

}
