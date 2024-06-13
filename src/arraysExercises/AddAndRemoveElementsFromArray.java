package arraysExercises;

import java.util.Scanner;

public class AddAndRemoveElementsFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] commands = sc.nextLine().split(",");

        int initialValue = 1;
        int[] numberArr = new int[0];
        int arrLength = 0;

        for (int i = 0; i < commands.length; i++) {
            int[] currentValuesArr = numberArr;

            if (commands[i].equals("add")) {

                numberArr = new int[++arrLength];

                if (currentValuesArr.length > 0) {

                    for (int j = 0; j < currentValuesArr.length; j++) {
                        numberArr[j] = currentValuesArr[j];

                    }

                    numberArr[currentValuesArr.length] = initialValue;

                } else {
                    numberArr[i] = initialValue;
                }

                initialValue++;

            } else if (commands[i].equals("remove")) {

                if (numberArr.length > 0) {
                    numberArr = new int[currentValuesArr.length - 1];

                    for (int j = 0; j < currentValuesArr.length - 1; j++) {
                        numberArr[j] = currentValuesArr[j];
                    }

                    arrLength--;
                }

            }

        }

        if (numberArr.length > 0) {
            for (int n : numberArr) {
                System.out.print(n + " ");
            }

        } else {
            System.out.println("Empty");
        }

    }
}
