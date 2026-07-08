package bankingapplication;

import java.util.Scanner;

public class SimpleBankingApp {

    static double balance = 5000.00;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println("      SIMPLE BANK SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Send Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    depositMoney(deposit);
                    break;

                case 3:
                    System.out.print("Enter amount to send: ₹");
                    double send = sc.nextDouble();
                    sendMoney(send);
                    break;

                case 4:
                    System.out.println("Thank you for using our Bank!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }

    public static void checkBalance() {
        System.out.println("\nCurrent Balance: ₹" + balance);
    }

    public static void depositMoney(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
            System.out.println("Updated Balance: ₹" + balance);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public static void sendMoney(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " sent successfully.");
            System.out.println("Remaining Balance: ₹" + balance);
        }
    }
}
