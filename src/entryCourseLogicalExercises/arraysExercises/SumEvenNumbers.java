package entryCourseLogicalExercises.arraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numbers = sc.nextLine().split(",");

        int[] numArr = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();

        int evenNumSum = 0;
        for (int n : numArr) {

            if (n % 2 == 0) {
                evenNumSum += n;
            }

        }

        System.out.println(evenNumSum);
    }
}
