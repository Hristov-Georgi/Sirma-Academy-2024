package entryCourseLogicalExercises.conditionalStatementsTasks;

import java.util.Scanner;

public class AdventureGamePathDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rightHandTool = sc.nextLine();
        String leftHandTool = sc.nextLine();

        String chosenPath;
        if (rightHandTool.equals("sword") || leftHandTool.equals("sword")) {
            if (leftHandTool.equals("shield") || rightHandTool.equals("shield")) {
                chosenPath =  "Path to the castle";
            } else {
                chosenPath = "Path to the forest";
            }
        } else if (rightHandTool.equals("map") || leftHandTool.equals("map")) {
            if (leftHandTool.equals("coins") || rightHandTool.equals("coins")) {
                chosenPath = "Go to the town";
            } else {
                chosenPath = "Camp";
            }
        } else {
            chosenPath = "Wander aimlessly";
        }

        System.out.println(chosenPath);


    }
}
