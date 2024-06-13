package arraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        int oddNumbersSum = 0;
        int evenNumbersSum = 0;

        for (int n : numbers) {

            if (n % 2 == 0) {
                evenNumbersSum += n;
            } else {
                oddNumbersSum += n;
            }

        }

        System.out.println(evenNumbersSum - oddNumbersSum);

    }

}
