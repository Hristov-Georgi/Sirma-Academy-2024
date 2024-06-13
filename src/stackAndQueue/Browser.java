package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser {

    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayDeque<String> backwardUrls = new ArrayDeque<>();
        ArrayDeque<String> forwardUrls = new ArrayDeque<>();

        printCurrentPage(backwardUrls, forwardUrls);

    }

    private static void printCurrentPage(ArrayDeque<String> backwardUrls, ArrayDeque<String> forwardUrls) {
        String inputData = sc.nextLine();

        while (!inputData.equals("Home")) {

            if (inputData.startsWith("http")) {

                System.out.println(addUrl(backwardUrls, inputData));

            } else if (inputData.equals("back")) {

                System.out.println(goOnePageBack(backwardUrls, forwardUrls));

            } else if (inputData.equals("forward")) {

                System.out.println(goOnePageForward(backwardUrls, forwardUrls));
            }

            inputData = sc.nextLine();
        }

    }

    private static String goOnePageForward(ArrayDeque<String> backwardUrls, ArrayDeque<String> forwardUrls) {

        if (forwardUrls.isEmpty()) {
            return "no forward URLs";
        } else {
            String currentPage = forwardUrls.pop();

            backwardUrls.push(currentPage);

            return currentPage;
        }

    }

    private static String goOnePageBack(ArrayDeque<String> backwardUrls, ArrayDeque<String> forwardUrls) {

        if (backwardUrls.size() < 2) {

            return "no previous URLs";

        } else {

            String removedUrl = backwardUrls.pop();
            forwardUrls.push(removedUrl);

            return backwardUrls.peek();

        }

    }

    private static String addUrl(ArrayDeque<String> backwardUrls, String inputData) {

        backwardUrls.push(inputData);
        return backwardUrls.peek();

    }


}
