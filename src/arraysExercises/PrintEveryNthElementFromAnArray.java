package arraysExercises;

import java.util.Scanner;

public class PrintEveryNthElementFromAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] elementsArr = sc.nextLine().split(",");
        int step = Integer.parseInt(sc.nextLine());

        String result = "";

        for (int i = 0; i < elementsArr.length; i+=step) {

            result += elementsArr[i] + " ";
        }

        System.out.println(result.trim());


    }
}
