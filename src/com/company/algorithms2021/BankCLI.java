package com.company.algorithms2021;

import java.util.Scanner;

public class BankCLI {

    public static void main(String[] args) {

        Bank bank1 = new Bank("Richies Luong", "12418");
        bank1.displayMenu();

    }

    static class Bank {

        int balance;
        int previousTransaction;
        String customerName;
        String customerId;

        Bank(String name, String id) {
            customerName = name;
            customerId = id;
        }

        void deposit(int amount) {

            if (amount != 0) {
                balance = balance + amount;
                previousTransaction = amount;
            }
        }

        void withdraw(int amount) {

            if (amount != 0) {
                balance = balance - amount;
                previousTransaction = -amount;
            }
        }

        void getPreviousTransaction() {

            if (previousTransaction > 0) {
                System.out.println("Deposited: " + previousTransaction);
            } else if (previousTransaction < 0) {
                System.out.println("Withdrawn: " + Math.abs(previousTransaction));
            } else {
                System.out.println("No transaction occurred");
            }
        }

        void displayMenu() {

            char option;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome " + customerName);
            System.out.println("ID number: " + customerId);
            do {
                System.out.println("\n");
                System.out.println("A. Check Balance");
                System.out.println("B. Deposit");
                System.out.println("C. Withdraw");
                System.out.println("D. Previous Transaction");
                System.out.println("E. Exit");

                System.out.println("===========================================================");
                System.out.println("Enter an option");
                option = scanner.next().toUpperCase().charAt(0);
                System.out.println("\n");

                switch (option) {
                    case 'A' -> {
                        System.out.println("----------------------------");
                        System.out.println("Balance: " + balance);
                        System.out.println("----------------------------");
                        System.out.println("\n");
                    }
                    case 'B' -> {
                        System.out.println("----------------------------");
                        System.out.println("Enter an amount to deposit");
                        System.out.println("----------------------------");
                        int amount = scanner.nextInt();
                        deposit(amount);
                        System.out.println("\n");
                    }
                    case 'C' -> {
                        System.out.println("----------------------------");
                        System.out.println("Enter an amount to withdraw");
                        System.out.println("----------------------------");
                        int amount2 = scanner.nextInt();
                        withdraw(amount2);
                        System.out.println("\n");
                    }
                    case 'D' -> {
                        System.out.println("----------------------------");
                        getPreviousTransaction();
                        System.out.println("----------------------------");
                        System.out.println("\n");
                    }
                    case 'E' -> System.out.println("*****************************************");
                    default -> System.out.println("Not an option. Please enter a valid option");
                }
            } while (option != 'E');

            System.out.println("Here at Bank of RI, we value our customers.\nThank you for choosing us!");
        }
    }
}

