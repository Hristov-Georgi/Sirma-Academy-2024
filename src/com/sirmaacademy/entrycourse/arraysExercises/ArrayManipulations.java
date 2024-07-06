package com.sirmaacademy.entrycourse.arraysExercises;

import java.util.Scanner;

public class ArrayManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] elementsArr = sc.nextLine().split("\\s+");

        String[] commandsArr = sc.nextLine().split(",\\s+");

        for (String e : commandsArr) {

            String[] commands = e.split("\\s+");
            String commandName = commands[0];
            String elementToAddOrRemove = commands[1];

            switch (commandName) {

                case "Add":
                    elementsArr = addElementToTheEnd(elementsArr, elementToAddOrRemove);
                    
                    break;

                case "Remove":
                   int elementNum = countElementsToRemove(elementsArr, elementToAddOrRemove);
                   int arrayLength = elementsArr.length - elementNum;

                   elementsArr = fillArrayWithoutRemovedElements(elementsArr, elementToAddOrRemove, arrayLength);

                    break;

                case "RemoveAt":
                    int position = Integer.parseInt(commands[1]);

                    elementsArr = removeElementAtGivenPosition(elementsArr, position);

                    break;

                case "Insert":
                    String elementToInsert = commands[1];
                    int index = Integer.parseInt(commands[2]);

                    elementsArr = insertElementToGivenIndex(elementsArr, index, elementToInsert);

                    break;
            }
        }

        for (String s : elementsArr) {
            System.out.print(s + " ");
        }

    }

    private static String[] insertElementToGivenIndex(String[] array, int index, String element) {
        String[] result = new String[array.length + 1];

        for (int i = 0; i <= result.length - 1; i++) {

             if (i < index) {
                result[i] = array[i];
            } else if (i == index) {
                result[i] = element;
            } else {
                result[i] = array[i -1];
            }
        }

        return result;

    }

    private static String[] removeElementAtGivenPosition(String[] array, int position) {
        String[] resultArr = new String[array.length - 1];

        for (int i = 0; i < resultArr.length; i++) {

            if (i >= position) {
                resultArr[i] = array[i + 1];
            } else {
                resultArr[i] = array[i];
            }
        }

        return resultArr;
    }

    private static String[] addElementToTheEnd(String[] array, String element) {
        String[] result = new String[array.length + 1];

        System.arraycopy(array, 0, result, 0, array.length);

        result[result.length - 1] = element;

        return result;
    }

    private static String[] fillArrayWithoutRemovedElements(String[] array, String elementNotToInclude, int arrLength) {
        String[] result = new String[arrLength];

        int counter = 0;
        for (String e : array) {

            if (!e.equals(elementNotToInclude)) {
                result[counter] = e;
                counter++;
            }

        }

        return result;
    }

    private static int countElementsToRemove(String[] elements, String elementToRemove) {
        int elementNumber = 0;

        for (String el : elements) {
            if (el.equals(elementToRemove)) {
                elementNumber++;
            }
        }

        return  elementNumber;
    }

}
