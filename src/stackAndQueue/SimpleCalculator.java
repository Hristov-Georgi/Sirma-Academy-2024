package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] operators = sc.nextLine().split("\\s+");

        ArrayDeque<String> calculationOperators = fillCharArrayDeque(operators);

        while (calculationOperators.size() > 1) {

           executeSingleOperation(calculationOperators);

        }

        System.out.println(calculationOperators.peek());


    }

    private static void executeSingleOperation(ArrayDeque<String> stack) {

        int firstOperand = Integer.parseInt(stack.pop());
        String actionSymbol = stack.pop();
        int secondOperand = Integer.parseInt(stack.pop());

        int result = 0;

        if (actionSymbol.equals("+")) {
            result = firstOperand + secondOperand;
        } else if (actionSymbol.equals("-")){
            result = firstOperand - secondOperand;
        }

        stack.push(String.valueOf(result));

    }

    private static ArrayDeque<String> fillCharArrayDeque(String[] symbols) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        for (int i = symbols.length - 1; i >= 0 ; i--) {
            arrayDeque.push(symbols[i]);
        }

        return arrayDeque;
    }

}
