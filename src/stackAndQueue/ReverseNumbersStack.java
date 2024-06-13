package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputArr = Arrays.stream(sc.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        ArrayDeque<Integer> intStack = new ArrayDeque<>();

        for (int n : inputArr) {
            intStack.push(n);
        }

//        for (int n : intStack) {
//            System.out.print(n + " ");
//        }

        while (!intStack.isEmpty()) {
            System.out.print(intStack.pop() + " ");
        }


    }
}
