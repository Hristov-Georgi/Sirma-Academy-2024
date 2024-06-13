package loopsExercises;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int l = Integer.parseInt(sc.nextLine());

        for (int first = 1; first <= n ; first++) {

            for (int second = 1; second <= n; second++) {

                for (int third = 97; third < 97 + l; third++) {

                    for (int fourth = 97; fourth < 97 + l; fourth++) {

                        for (int fifth = 1; fifth <= n; fifth++) {

                            if (first < fifth && second < fifth) {
                                String result = "" +
                                        first +
                                        second +
                                        (char) third +
                                        (char) fourth +
                                        fifth;

                                System.out.println(result);

                            }

                        }

                    }

                }

            }

        }

    }

}
