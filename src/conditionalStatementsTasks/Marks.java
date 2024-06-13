package conditionalStatementsTasks;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double number = Double.parseDouble(sc.nextLine());

        if (number >= 5.50) {
            System.out.println("Excellent!");
        }

        sc.close();
    }
}
