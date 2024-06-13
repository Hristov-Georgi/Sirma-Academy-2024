package arraysExercises;

import java.util.Scanner;

public class SumFirstAndLastArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numbers = sc.nextLine().split(",");

        int firstElement = Integer.parseInt(numbers[0]);
        int secondElement = Integer.parseInt(numbers[numbers.length - 1]);

        int sum = firstElement + secondElement;

        System.out.println(sum);
    }
}
