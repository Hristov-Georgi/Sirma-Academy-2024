package arraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(numbersArr);

        System.out.println(numbersArr[0] + " " + numbersArr[1]);
    }
}
