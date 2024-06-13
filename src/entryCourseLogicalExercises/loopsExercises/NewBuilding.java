package entryCourseLogicalExercises.loopsExercises;

import java.util.Scanner;

public class NewBuilding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int floors = Math.abs(Integer.parseInt(sc.nextLine()));
        int rooms = Math.abs(Integer.parseInt(sc.nextLine()));

        for (int floor = floors; floor >= 1; floor--) {
            for (int room = 0; room < rooms ; room++) {

                if (floor == floors) {
                    System.out.printf("L%d%d ", floor, room);
                } else if(floor % 2 == 0) {
                    System.out.printf("O%d%d ",floor, room);
                } else {
                    System.out.printf("A%d%d ", floor, room);
                }
            }
            System.out.println();
        }
    }
}
