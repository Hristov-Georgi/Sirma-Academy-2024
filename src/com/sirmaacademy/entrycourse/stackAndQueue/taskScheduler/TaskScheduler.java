package com.sirmaacademy.entrycourse.stackAndQueue.taskScheduler;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TaskScheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Task> priorityQueue = new PriorityQueue<>(
                Comparator.comparingInt(Task::getPriority).reversed()
        );

        String input = sc.nextLine();

        while (!input.equals("getNextTask")) {

            if (input.split("\\s+")[0].equals("Add")) {

                addElementsToPriorityQueue(input, priorityQueue);

            }

            input = sc.nextLine();
        }

        System.out.println(priorityQueue.poll());

    }

    private static void addElementsToPriorityQueue(String input, PriorityQueue<Task> priorityQueue) {

        String name = input.split("\\s+")[1];
        int priority = Integer.parseInt(input.split("\\s+")[2]);

        Task task = new Task(name, priority);
        priorityQueue.offer(task);
    }
}
