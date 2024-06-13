package conditionalStatementsTasks;

import java.util.Scanner;

public class SurvivalInTheWilderness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String partOfTheDay = sc.nextLine();
        String environment = sc.nextLine();
        String item = sc.nextLine();

        String courseOfAction;
        switch (partOfTheDay) {

            case "day":
                courseOfAction = dayCourseOfAction(environment, item);
                break;

            case "night":
                courseOfAction = nightCourseOfAction(environment, item);
                break;

            default:
                courseOfAction = "Invalid part of the day";
                break;

        }

        System.out.println(courseOfAction);
    }

    private static String dayCourseOfAction(String environment, String item) {
        String dayAction;

        switch (environment) {

            case "forest":

                if (item.equals("knife")) {
                    dayAction = "Hunt for food";
                } else if (item.equals("container")) {
                    dayAction = "Collect berries";
                } else {
                    dayAction = "Explore";
                }
                break;

            case "desert":

                if (item.equals("hat")) {
                    dayAction = "Search for water";
                } else {
                    dayAction = "Find shade";
                }
                break;

            default:
                dayAction = "Does not have case for this environment";
                break;
        }

        return dayAction;

    }

    private static String nightCourseOfAction(String environment, String item) {
        String nightAction;

        switch (environment) {

            case "forest":
                if (item.equals("firestarter")) {
                    nightAction = "Make a campfire";
                } else {
                    nightAction = "Climb a tree for safety";
                }
                break;

            case "desert":
                if (item.equals("blanket")) {
                    nightAction = "Sleep";
                } else {
                    nightAction = "Keep moving to stay warm";
                }
                break;

            default:
                nightAction = "Does not have case for this environment";
                break;
        }

        return nightAction;

    }


}
