package entryCourseLogicalExercises.classes.randomizeWords;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int randomNum = rnd.nextInt(words.length);

            String currentValue = words[i];
            String secondValue = words[randomNum];

            words[i] = secondValue;
            words[randomNum] = currentValue;

        }

        for (String w : words) {
            System.out.println(w);
        }
    }
}
