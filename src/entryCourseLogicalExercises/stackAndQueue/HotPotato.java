package entryCourseLogicalExercises.stackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] childrenNames = sc.nextLine().split("\\s+");
        int passCount = Integer.parseInt(sc.nextLine());

        playHotPotato(childrenNames, passCount);

    }

    private static void playHotPotato(String[] childrenNames, int passCount) {
        ArrayDeque<String> hotPotatoChildrenQueue = fillStack(childrenNames);

        while (hotPotatoChildrenQueue.size() > 1) {

            for (int i = 1; i < passCount; i++) {
                String name = hotPotatoChildrenQueue.pollFirst();
                hotPotatoChildrenQueue.offer(name);
            }

            System.out.println("Remove " + hotPotatoChildrenQueue.poll());

        }

        System.out.println("Last is " + hotPotatoChildrenQueue.pollFirst());

    }

    private static ArrayDeque<String> fillStack(String[] array) {
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String s : array) {

            if (!s.isBlank()) {
                queue.offer(s);
            }

        }

        return queue;

    }
}
