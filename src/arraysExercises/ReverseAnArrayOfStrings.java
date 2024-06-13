package arraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Ако следвам условието и първо reverse масива и после разменя елементите в него,
        ще се получи същата стойност като входните данни, което се разминава с
        примерните изходни данни.
        При решението следвам изходните данни да съвпадат.
         */


        String[] elementsArr = sc.nextLine().split(",");

        for (int i = 0; i < elementsArr.length / 2; i++) {

            String firstValue = elementsArr[i];
            String secondValue = elementsArr[elementsArr.length - i - 1];

            elementsArr[i] = secondValue;
            elementsArr[elementsArr.length - i - 1] = firstValue;

        }

        System.out.println(String.join(" ", elementsArr));

    }
}
