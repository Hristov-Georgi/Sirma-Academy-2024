package arraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSequenceOfIdenticalElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] elementsArr = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        int identicalElementsCount = 1;
        int elementValue = elementsArr[0];
        int lastEqualElementsCount = 1;
        int previousElement = elementsArr[0];


        for (int i = 1; i < elementsArr.length; i++) {
            int currentElement = elementsArr[i];

            if (currentElement == previousElement) {
                lastEqualElementsCount++;

            } else {

                if (lastEqualElementsCount >= identicalElementsCount) {
                    identicalElementsCount = lastEqualElementsCount;
                    elementValue = previousElement;
                }

                lastEqualElementsCount = 1;
                previousElement = currentElement;


            }

        }

        if (lastEqualElementsCount >= identicalElementsCount) {

            for (int i = 0; i < lastEqualElementsCount; i++) {
                System.out.print(previousElement + " ");
            }

        } else {

            for (int i = 0; i < identicalElementsCount; i++) {
                System.out.print(elementValue + " ");
            }

        }


    }
}
