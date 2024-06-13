package entryCourseLogicalExercises.loopsExercises;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int result = 0;
        for (int i = 2; i <= 2 * n ; i+=2) {
            result += i;
        }

        System.out.println(result);
    }
}
