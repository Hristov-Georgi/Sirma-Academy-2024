package entryCourseLogicalExercises.conditionalStatementsTasks;

import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        System.out.println(programmersHoliday(budget, season));

    }

    private static String programmersHoliday(double budget, String season) {

        if (budget < 10 || budget > 5000) {
            return "Budget should be in the range [10.00...5000.00]";

        } else if (!season.equals("summer") && !season.equals("winter")) {
            return "Vacation is only in summer or winter";

        }

        String destinationCountry = destination(budget);
        double spendBudget = budgetToSpend(season, destinationCountry, budget);

        if (season.equals("summer")) {
            return String.format("Somewhere in %s%n%s - %.2f", destinationCountry, "Camp", spendBudget);
        } else {
            return String.format("Somewhere in %s%n%s - %.2f", destinationCountry,"Hotel", spendBudget);
        }
    }

    private static String destination (double budget) {
        String destination = null;

        if (budget >= 10 && budget <= 100) {
            destination = "Bulgaria";

        } else if(budget <= 1000) {
            destination = "Europe";

        } else if(budget <= 5000) {
            destination = "Asia";
        }

        return destination;
    }

    private static double budgetToSpend (String season, String destination, double budget) {
        double vacationAmount = 0.0;

        switch (season) {
            case "summer":
                if (destination.equals("Bulgaria")) {
                    vacationAmount = budget * 0.3;
                } else if(destination.equals("Europe")) {
                    vacationAmount = budget * 0.4;
                } else if (destination.equals("Asia")) {
                    vacationAmount = budget * 0.9;
                }

                break;

            case "winter":
                if (destination.equals("Bulgaria")) {
                    vacationAmount = budget * 0.7;
                } else if(destination.equals("Europe")) {
                    vacationAmount = budget * 0.8;
                } else if (destination.equals("Asia")) {
                    vacationAmount = budget * 0.9;
                }

                break;
        }

        return vacationAmount;
    }
}
