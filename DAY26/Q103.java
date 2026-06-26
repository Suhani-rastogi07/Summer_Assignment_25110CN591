import java.util.*;

public class Q103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        System.out.println("===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your balance is: " + balance);
                break;

            case 2:
                System.out.print("Enter amount to deposit: ");
                int deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Updated balance: " + balance);
                break;

            case 3:
                System.out.print("Enter amount to withdraw: ");
                int withdraw = sc.nextInt();

                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Please collect your cash.");
                    System.out.println("Remaining balance: " + balance);
                } else {
                    System.out.println("Insufficient balance.");
                }
                break;

            case 4:
                System.out.println("Thank you for using the ATM.");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
