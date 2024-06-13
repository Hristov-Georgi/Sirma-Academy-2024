package loopsExercises;

import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        int currentValue = 1;
        boolean endOfProgram = false;

        int row = 1;
        while (currentValue <= number) {

            for (int i = 1; i <= row; i++) {

                if (currentValue == number) {
                    System.out.println(currentValue);
                    endOfProgram = true;
                    break;

                } else {

                    System.out.print(currentValue + " ");

                    currentValue++;

                }
            }

            if (endOfProgram) {
                break;
            }

            System.out.println();

            row++;

        }
    }
}
