package entryCourseLogicalExercises.arraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastKNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = Integer.parseInt(sc.nextLine());
        int[] numbersArr = Arrays.stream(sc.nextLine().split(", "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        for (int i = 0; i < k; i++) {
            System.out.print(numbersArr[i] + " ");
        }

        System.out.println();

        for (int i = numbersArr.length - k; i < numbersArr.length ; i++) {
            System.out.print(numbersArr[i] + " ");
        }
    }
}
