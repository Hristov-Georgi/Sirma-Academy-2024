package entryCourseLogicalExercises.arraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int[] numArray = Arrays.stream(sc.nextLine().split(","))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int[] reversedArr = new int[number];

        for (int i = 0; i < number; i++) {
            reversedArr[number - i - 1] = numArray[i];
        }

        for (int n : reversedArr) {
            System.out.print(n + " ");
        }


    }
}
