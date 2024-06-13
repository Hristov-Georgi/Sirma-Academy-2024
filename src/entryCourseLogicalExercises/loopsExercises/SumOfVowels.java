package entryCourseLogicalExercises.loopsExercises;

import java.util.Scanner;

public class SumOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().toLowerCase();

        int vowelCount = 0;
        for (int i = 0; i < word.length() ; i++) {

            if (word.charAt(i) == 'A' || word.charAt(i) == 'a') {

                vowelCount += 1;

            } else if (word.charAt(i) == 'E' || word.charAt(i) == 'e') {

                vowelCount += 2;

            } else if ( word.charAt(i) == 'I' || word.charAt(i) == 'i'){

                vowelCount += 3;

            } else if ( word.charAt(i) == 'O' || word.charAt(i) == 'o') {

                vowelCount += 4;

            } else if ( word.charAt(i) == 'U' || word.charAt(i) == 'u') {

                vowelCount += 5;

            }
        }

        System.out.println(vowelCount);
    }
}
