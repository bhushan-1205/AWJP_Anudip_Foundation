import java.util.Scanner;

class ArithmeticException extends RuntimeException {
    public ArithmeticException(String message) {
        super(message);
    }
}

public class BankAccount {

    int Amount;
    int Withdraw;

    public void deposit() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter amount : ");
            Amount = sc.nextInt();

            System.out.print("Enter amount to withdraw: ");
            Withdraw = sc.nextInt();

            if (Withdraw > Amount) {
                throw new ArithmeticException("Insufficient Balance");
            } else {
                System.out.println("Collect your Cash");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount d = new BankAccount();
        d.deposit();
    }

}
