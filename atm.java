import java.util.Scanner;

public class atm {
    private static Scanner sc = new Scanner(System.in);
    private static int balance = 1000;

    public static void main(String[] args) {
        display();

        while (true) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("EXIT");
                    return;
                default:
                    System.out.println("Wrong choice");
            }
            display();
        }
    }

    private static void display() {
        System.out.println("\n=== Welcome to ATM ===");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice : ");
    }

    private static void deposit() {
        System.out.print("Enter amount you want to deposit : ");
        int add = sc.nextInt();
        if (add < 0) {
            System.out.println("Enter correct amount");
            return;
        }
        balance = balance + add;
        System.out.println("\nYour amount of " + add + " is credited to your account");
        System.out.println("Your updated balance: " + balance);
    }

    private static void withdraw() {
        System.out.print("Enter the amount : ");
        int amt = sc.nextInt();
        if (amt < 0 || amt > balance) {
            System.out.println("Insufficient amount or invalid input");
            return;
        }
        balance = balance - amt;
        System.out.println("\nWithdrawal successful. Your remaining balance is " + balance);
    }

    private static void checkBalance() {
        System.out.println("\nYour account balance is " + balance);
    }
}