package arraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ProcessOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(sc.nextLine().split(", "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        int[] oddDoubledNumArr = new int[numbersArr.length / 2];

        int iteration = 1;
        for (int i = 1; i <= numbersArr.length - 1 ; i+=2) {

            oddDoubledNumArr[oddDoubledNumArr.length - iteration++] = numbersArr[i] * 2;

        }

        for (int n : oddDoubledNumArr) {
            System.out.print(n + " ");
        }

    }
}
