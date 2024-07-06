package com.sirmaacademy.entrycourse.stackAndQueue.factorio;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Factorio {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] robotsData = sc.nextLine().split("\\|");
        String startingTime = sc.nextLine();

        ArrayDeque<FactorioProduct> productsQueue = new ArrayDeque<>();
        addProductsInQueue(productsQueue, startingTime);

        ArrayDeque<Robot> robotQueue = new ArrayDeque<>();
        createRobots(robotsData, robotQueue);

        processProducts(productsQueue, robotQueue);

    }

    private static void processProducts(ArrayDeque<FactorioProduct> productsQueue, ArrayDeque<Robot> robotQueue) {
        int startNewProcessingPerSecond = 0;

        while (!productsQueue.isEmpty()) {

            for (int i = 0; i < robotQueue.size(); i++) {

                ++startNewProcessingPerSecond;

                if (robotQueue.peek().isFree(startNewProcessingPerSecond)) {

                    FactorioProduct currentProduct = productsQueue.poll();

                    Robot currentRobot = robotQueue.poll();

                    currentProduct.setProcessingStartTime(startNewProcessingPerSecond);

                    currentRobot.setProductList(currentProduct);

                    System.out.printf("%s - %s [%s]%n",
                            currentRobot.getModel(),
                            currentProduct.getName(),
                            currentProduct.getProcessingStartTime());

                    robotQueue.offer(currentRobot);

                } else {
                    robotQueue.offer(robotQueue.poll());
                }

            }

        }

    }

    private static void createRobots(String[] robotsData, ArrayDeque<Robot> robotList) {
        for (int i = 0; i < robotsData.length; i++) {

            String[] singleRobot = robotsData[i].split("-");

            Robot robot = new Robot(singleRobot[0], Integer.parseInt(singleRobot[1]));

            robotList.add(robot);
        }
    }

    private static void addProductsInQueue(ArrayDeque<FactorioProduct> productsQueue, String productLineStartTime) {
        String productName = sc.nextLine();

        while (!productName.equals("End")) {

            FactorioProduct product = new FactorioProduct(productName, productLineStartTime);

            productsQueue.offer(product);

            productName = sc.nextLine();
        }

    }
}
