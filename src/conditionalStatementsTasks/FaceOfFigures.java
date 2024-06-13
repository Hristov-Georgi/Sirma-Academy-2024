package conditionalStatementsTasks;

import java.util.List;
import java.util.Scanner;

public class FaceOfFigures {
    public static void main(String[] args) {
        final List<String> figures = List.of("circle", "square", "rectangle", "triangle");

        Scanner sc = new Scanner(System.in);

        String figure = sc.nextLine();

        if (!figures.contains(figure)) {
            System.out.println("Figure type does not match");
            return;
        }

        double length = Double.parseDouble(sc.nextLine());

        if (isNegative(length)) {
            System.out.println("Length should be positive");
            return;
        }

        double result = 0;

        switch (figure) {
            case "triangle":
                double height = Double.parseDouble(sc.nextLine());

                if (isNegative(height)) {
                    break;
                }

                result = length * height / 2;

                break;

            case "rectangle":
                double sideB = Double.parseDouble(sc.nextLine());

                if (isNegative(sideB)) {
                    break;
                }

                result = length * sideB;

                break;

            case "square":
                result = Math.pow(length, 2);
                break;

            case "circle":
                result = Math.pow(length, 2) * Math.PI;
                break;

        }

        if (result != 0) {
            System.out.printf("%.2f", result);
        } else {
            System.out.println("Second parameter is zero or negative number");
        }
        
    }

    private static boolean isNegative(double parameter) {
        return parameter <= 0;
    }
}
