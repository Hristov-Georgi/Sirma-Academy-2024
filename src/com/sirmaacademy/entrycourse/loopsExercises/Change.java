package com.sirmaacademy.entrycourse.loopsExercises;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double input = Double.parseDouble(sc.nextLine());

        double stotinki = input * 100;

        int counter = 0;
        if (stotinki >= 200) {
            double coinsNumber = Math.floor(stotinki / 200);

            counter += (int) coinsNumber;
            stotinki -= (coinsNumber * 200);
        }

        if (stotinki >= 100) {
            counter++;
            stotinki -= 100;
        }

        if (stotinki >= 50) {
            counter++;
            stotinki -= 50;
        }

        if (stotinki >= 20) {

            if (stotinki >= 40) {
                counter += 2;
                stotinki -= 40;
            } else {
                counter++;
                stotinki -= 20;
            }

        }

        if (stotinki >= 10) {
            counter++;
            stotinki -= 10;
        }

        if (stotinki >= 5) {
            counter++;
            stotinki -= 5;
        }

        if (stotinki >= 2) {

            if (stotinki >= 4) {
                counter += 2;
                stotinki -= 4;
            } else {
                counter++;
                stotinki -= 2;
            }

        }

        if (stotinki >= 1) {
            counter++;
        }

        System.out.println(counter);

    }
}
