package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int[] commandElements = Arrays.stream(sc.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt)
                                .toArray();

        int numberOfElToOffer = commandElements[0];
        int numberOfElToPoll = commandElements[1];
        int searchedElement = commandElements[2];

        int[] elementsToOffer = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        offerElements(queue, numberOfElToOffer, numberOfElToPoll, elementsToOffer);

        printIfContainsElementElseSmallestNumber(queue, searchedElement);


    }

    private static void printIfContainsElementElseSmallestNumber(ArrayDeque<Integer> queue, int searchedElement) {

        if (queue.isEmpty()) {
            System.out.println(0);
        } else if (queue.contains(searchedElement)) {
            System.out.println("true");
        } else {
            System.out.println(queue.stream().min(Integer::compare).get());
        }

    }


    private static void offerElements(ArrayDeque<Integer> queue, int numberOfElementsToOffer,
                                      int numberOfElementsToPoll, int[] elements) {

        int elementsSize = elements.length;

        for (int i = numberOfElementsToPoll; i < numberOfElementsToOffer; i++) {

            if (i >= elementsSize) {
                break;
            }

            queue.offer(elements[i]);
        }

    }
}
