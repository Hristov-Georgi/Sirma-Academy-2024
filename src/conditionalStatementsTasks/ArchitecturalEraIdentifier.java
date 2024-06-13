package conditionalStatementsTasks;

import java.util.Scanner;

public class ArchitecturalEraIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double year = Double.parseDouble(sc.nextLine());
        String material = sc.nextLine();

        String era = "Uncertain";
        switch (material) {

            case "wood":
                if (1500 <= year && year <= 1800) {
                    era = "Colonial";
                }

                break;

            case "stone":

                if (year < 500) {
                    era = "Ancient";
                } else if (year <= 1500) {
                    era = "Medieval";
                }

                break;

            case "steel":

                if (1800 <= year && year <= 1900) {
                    era = "Industrial";
                } else if (year > 1900) {
                    era = "Modern";
                }

                break;

        }

        System.out.println(era);

    }

}
