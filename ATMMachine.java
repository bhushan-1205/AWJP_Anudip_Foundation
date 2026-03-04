import java.util.ArrayList;
import java.util.Scanner;

class ATM {
    private int pin = 1234;
    private double balance = 10000.0;
    private ArrayList<String> miniStatement = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // PIN validation
    public boolean validatePin() {
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();
        return enteredPin == pin;
    }

    // Balance check
    public void checkBalance() {
        System.out.println("Available Balance: " + balance);
        miniStatement.add("Checked Balance: " + balance);
    }

    // Deposit
    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
            miniStatement.add("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Withdraw
    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Please collect your cash.");
            miniStatement.add("Withdrawn: " + amount);
        }
    }

    // Change PIN
    public void changePin() {
        System.out.print("Enter old PIN: ");
        int oldPin = sc.nextInt();

        if (oldPin == pin) {
            System.out.print("Enter new PIN: ");
            pin = sc.nextInt();
            System.out.println("PIN changed successfully.");
            miniStatement.add("PIN changed");
        } else {
            System.out.println("Incorrect old PIN.");
        }
    }

    // Mini statement
    public void showMiniStatement() {
        if (miniStatement.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Mini Statement:");
            for (String s : miniStatement) {
                System.out.println("- " + s);
            }
        }
    }
}

public class ATMMachine {
    public static void main(String[] args) {

        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);

        if (!atm.validatePin()) {
            System.out.println("Invalid PIN. Card blocked.");
            return;
        }

        int choice;
        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            System.out.println("5. Mini Statement");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> atm.checkBalance();
                case 2 -> atm.deposit();
                case 3 -> atm.withdraw();
                case 4 -> atm.changePin();
                case 5 -> atm.showMiniStatement();
                case 6 -> System.out.println("Thank you for using ATM.");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}
