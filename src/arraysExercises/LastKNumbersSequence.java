package arraysExercises;

import java.util.Scanner;

public class LastKNumbersSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int k = Integer.parseInt(sc.nextLine());

        int initialElement = 1;

        int[] resultArr = new int[n];
        resultArr[0] = initialElement;

        for (int i = 1; i < n; i++) {

            int lowerBound = 0;
            if (i > k) {
                lowerBound = i - k;
            }

            int currentElement = 0;
            for (int j = i - 1; j >= lowerBound ; j--) {
                currentElement += resultArr[j];
            }

            resultArr[i] = currentElement;

        }

        for (int e : resultArr) {
            System.out.print(e + " ");
        }

    }

}
