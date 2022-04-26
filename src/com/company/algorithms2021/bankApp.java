
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankApp bank1 = new BankApp("Richies Luong", "12418");
        bank1.displayMenu();

    }

    static class BankApp {

        int balance;
        int previousTransaction;
        String customerName;
        String customerId;

        BankApp(String name, String id) {
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
            System.out.println("\n");
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. Previous Transaction");
            System.out.println("E. Exit");

            do {
                System.out.println("===========================================================");
                System.out.println("Enter an option");
                option = scanner.next().toUpperCase().charAt(0);
                System.out.println("\n");

                switch (option) {
                    case 'A':
                        System.out.println("----------------------------");
                        System.out.println("Balance: " + balance);
                        System.out.println("----------------------------");
                        System.out.println("\n");
                        break;

                    case 'B':
                        System.out.println("----------------------------");
                        System.out.println("Enter an amount to deposit");
                        System.out.println("----------------------------");
                        int amount = scanner.nextInt();
                        deposit(amount);
                        System.out.println("\n");
                        break;

                    case 'C':
                        System.out.println("----------------------------");
                        System.out.println("Enter an amount to withdraw");
                        System.out.println("----------------------------");
                        int amount2 = scanner.nextInt();
                        withdraw(amount2);
                        System.out.println("\n");
                        break;

                    case 'D':
                        System.out.println("----------------------------");
                        getPreviousTransaction();
                        System.out.println("----------------------------");
                        System.out.println("\n");
                        break;

                    case 'E':
                        System.out.println("*****************************************");
                        break;

                    default:
                        System.out.println("Not an option. Please enter a valid option");
                        break;
                }
            } while (option != 'E');

            System.out.println("Here at Bank of RI, we value our customers.\nThank you for choosing us!");
        }
    }
}

