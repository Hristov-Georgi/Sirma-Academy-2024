package entryCourseLogicalExercises.arraysExercises;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] firstArr = sc.nextLine().split(",");
        String[] secondArr = sc.nextLine().split(",");

        if (firstArr.length < secondArr.length) {
            System.out.printf("Arrays are not identical. Found difference at %d index%n", firstArr.length);
        } else if (secondArr.length < firstArr.length) {
            System.out.printf("Arrays are not identical. Found difference at %d index%n", secondArr.length);
        } else {

            boolean areIdentical = true;
            int sum = 0;
            for (int i = 0; i < firstArr.length; i++) {

                if (firstArr[i].equals(secondArr[i])) {
                    sum += Integer.parseInt(firstArr[i]);
                } else {
                    areIdentical = false;
                    System.out.printf("Arrays are not identical. Found difference at %d index%n", i);
                    break;
                }
            }

            if (areIdentical) {
                System.out.printf("Arrays are identical. Sum: %d%n", sum);
            }


        }

    }

}
