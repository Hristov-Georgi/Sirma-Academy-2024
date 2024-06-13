package entryCourseLogicalExercises.loopsExercises;

import java.util.Scanner;

public class NumbersUpTo1000EndingInN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = n; i <= 1000 ; i+=10) {
            System.out.println(i);
        }
    }
}
