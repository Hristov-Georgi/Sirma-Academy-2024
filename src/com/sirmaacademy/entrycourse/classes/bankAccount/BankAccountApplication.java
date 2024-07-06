package com.sirmaacademy.entrycourse.classes.bankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        List<BankAccount> accountsList = new ArrayList<>();

        while (!input.equals("End")) {

            String[] commands = input.split("\\s+");

            switch (commands[0]) {

                case "Create":
                    BankAccount account = createAccount();
                    accountsList.add(account);
                    System.out.printf("Account ID%d created%n", account.getId());

                    break;

                case "Deposit":
                    int id = Integer.parseInt(commands[1]);
                    double amount = Double.parseDouble(commands[2]);

                    if (deposit(accountsList, id, amount)) {
                        System.out.printf("Deposited %.2f to ID%d%n", amount, id);
                    } else {
                        System.out.println("Account does not exist");
                    }

                    break;

                case "SetInterest":
                    double interest = Double.parseDouble(commands[1]);

                    setInterestRate(accountsList, interest);

                    break;

                case "GetInterest":
                    int accountId = Integer.parseInt(commands[1]);
                    int years = Integer.parseInt(commands[2]);

                    double interestRate = getInterestRate(accountsList, accountId, years);
                    if ( interestRate < 0) {
                        System.out.println("Account does not exist");
                    } else {
                        System.out.println(interestRate);
                    }

                    break;
            }

            input = sc.nextLine();
        }

    }

    private static double getInterestRate(List<BankAccount> accountsList, int accountId, int years) {

        double interest = -1.0;

        for (BankAccount a : accountsList) {

            if (a.getId() == accountId) {
                interest = a.getInterestRate(years);

            }

        }

        return interest;
    }

    private static void setInterestRate(List<BankAccount> accounts, double interestRate) {

        for (BankAccount a : accounts) {
            a.setInterestRate(interestRate);
        }
    }

    private static boolean deposit(List<BankAccount> accounts, int id, double depositAmount) {
        boolean isSuccessful = false;

        for (BankAccount a : accounts) {

            if (a.getId() == id) {
                a.deposit(depositAmount);
                isSuccessful = true;
            }

        }

        return isSuccessful;

    }

    private static BankAccount createAccount() {
        return new BankAccount();
    }
}
