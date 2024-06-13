package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DocumentEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> redoStack = new ArrayDeque<>();

        String input = sc.nextLine();

        while (!input.equals("End")) {

            executeCommands(input, stack, redoStack);

            input = sc.nextLine();
        }


    }

    private static void executeCommands(String input, ArrayDeque<String> stack, ArrayDeque<String> redoStack) {
        String command = input.split("\\(")[0];

        switch (command) {

            case "Insert":
                String text = input.split("\"")[1].trim();

                insertTextToStack(text, stack);

                System.out.print(getStackElementsForPrint(stack));

                break;

            case "Undo":

                removeAddToStack(stack, redoStack);
                System.out.print(getStackElementsForPrint(stack));

                break;

            case "Redo":

                removeAddToStack(redoStack, stack);
                System.out.print(getStackElementsForPrint(stack));

                break;

        }

    }

    private static StringBuilder getStackElementsForPrint(ArrayDeque<String> stack) {
        StringBuilder sb = new StringBuilder();

        Object[] arr = stack.toArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            sb.append(" ");
        }

        sb.append(System.lineSeparator());

        return sb;
    }

    private static void removeAddToStack(ArrayDeque<String> removeFromStack, ArrayDeque<String> addToStack) {

        if (!removeFromStack.isEmpty()) {
            String text = removeFromStack.pop();
            addToStack.push(text);

        }

    }

    private static void insertTextToStack(String text, ArrayDeque<String> stack) {

        stack.push(text);
    }

}
