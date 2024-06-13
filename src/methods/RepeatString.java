package methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine();
        int repeatCount = Integer.parseInt(sc.nextLine());

        System.out.println(String.join("", repeatedStringValue(value, repeatCount)));

    }

    private static String[] repeatedStringValue(String value, int repeatCount) {
        String[] newValue = new String[repeatCount];

        for (int i = 0; i < repeatCount; i++) {
            newValue[i] = value;
        }

        return newValue;

    }

}
