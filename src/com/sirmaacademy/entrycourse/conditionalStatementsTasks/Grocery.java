package com.sirmaacademy.entrycourse.conditionalStatementsTasks;

import java.util.List;
import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        final List<String> cityList = List.of("Sofia", "Varna", "Plovdiv");
        final List<String> productsList = List.of("water", "juice", "chips", "sweets", "tea");

        Scanner sc = new Scanner(System.in);

        String productName = sc.nextLine();
        String city = sc.nextLine();
        double productQuantity = Double.parseDouble(sc.nextLine());

        if (cityList.contains(city) && productsList.contains(productName)) {
            System.out.printf("%.2f", price(productName, city) * productQuantity);
        } else {
            System.out.println("No such city or product in database");
        }


    }

    private static double price(String productName, String city) {

        double price = 0.0;

        switch (productName) {
            case "water":

                if (city.equals("Sofia")) {
                    price = 0.80;
                } else if (city.equals("Plovdiv")) {
                    price = 0.70;
                } else if (city.equals("Varna")) {
                    price = 0.70;
                }

                break;

            case "tea":

                if (city.equals("Sofia")) {
                    price = 0.50;
                } else if (city.equals("Plovdiv")) {
                    price = 0.40;
                } else if (city.equals("Varna")) {
                    price = 0.45;
                }
                break;

            case "juice":

                if (city.equals("Sofia")) {
                    price = 1.20;
                } else if (city.equals("Plovdiv")) {
                    price = 1.15;
                } else if (city.equals("Varna")) {
                    price = 1.10;
                }

                break;

            case "chips":

                if (city.equals("Sofia")) {
                    price = 1.60;
                } else if (city.equals("Plovdiv")) {
                    price = 1.50;
                } else if (city.equals("Varna")) {
                    price = 1.55;
                }

                break;

            case "sweets":

                if (city.equals("Sofia")) {
                    price = 1.40;
                } else if (city.equals("Plovdiv")) {
                    price = 1.30;
                } else if (city.equals("Varna")) {
                    price = 1.35;
                }

                break;
        }

        return price;

    }
}
