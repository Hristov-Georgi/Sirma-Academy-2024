package arraysExercises;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] elementsArr = sc.nextLine().split(",");
        int rotations = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < rotations; i++) {

            String lastElement = elementsArr[elementsArr.length -1];

            for (int j = elementsArr.length -1; j > 0; j--) {
                elementsArr[j] = elementsArr[j - 1];
            }

            elementsArr[0] = lastElement;
        }

        for (String e : elementsArr) {
            System.out.print(e + " ");
        }

    }

}
