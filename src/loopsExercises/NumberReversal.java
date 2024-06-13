package loopsExercises;

import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        if (n < 0) {

            System.out.println("Invalid input");

        } else {

            while (n > 0) {

                System.out.print(n % 10);

                n /= 10;
            }

        }

    }
}
