package conditionalStatementsTasks;

import java.util.Scanner;

public class PotionBrewingDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstIngredient = sc.nextLine();
        String secondIngredient = sc.nextLine();

        String potionName;
        if (firstIngredient.equalsIgnoreCase("herbs") ||
                secondIngredient.equalsIgnoreCase("herbs")) {

            if (secondIngredient.equalsIgnoreCase("water") ||
            firstIngredient.equalsIgnoreCase("water")) {

                potionName = "Health potion";

            } else if (secondIngredient.equalsIgnoreCase("oil") ||
                    firstIngredient.equalsIgnoreCase("oil")) {

                potionName = "Stealth potion";

            } else {
                potionName = "Minor stamina potion";

            }

        } else if (firstIngredient.equalsIgnoreCase("berries") ||
                secondIngredient.equalsIgnoreCase("berries")) {

            if (secondIngredient.equalsIgnoreCase("sugar") ||
                    firstIngredient.equalsIgnoreCase("sugar")) {

                potionName = "Speed potion";

            } else {
                potionName = "Minor energy potion";
            }

        } else {
            potionName = "No potion";
        }

        System.out.println(potionName);
    }
}
