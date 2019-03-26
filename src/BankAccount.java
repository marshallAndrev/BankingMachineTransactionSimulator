import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        int userChoose;
        float balance = 0f;
        float amount;
        boolean quit = false;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Choose your operation type: ");
            System.out.println("Deposit money - press 1");
            System.out.println("Withdrawl money - press 2");
            System.out.println("Saldo check - press 3");
            System.out.println("Quit - press 0");

            userChoose = scanner.nextInt();

            switch (userChoose) {
                case 1:
                    System.out.println("Amount to deposit: ");
                    amount = scanner.nextFloat();
                    if (amount <= 0) {
                        System.out.println("Deposit must be more than 0$");
                    } else {
                        balance = amount + balance;
                        System.out.println("You deposited: " + amount + "$");
                    }
                    break;
                case 2:
                    System.out.println("Amount to winthdrawl: ");
                    amount = scanner.nextFloat();
                    if (amount <= 0 || balance <= amount) {
                        System.out.println("Winthdrawl amount must be more than 0 $ or you hav't " +
                                "got enought money on your bank account");
                    } else {
                        balance = balance - amount;
                        System.out.println("You winthdrawl: " + balance + "$");
                        break;
                    }

                case 3:
                    System.out.println("Your balance: " + balance + "$");
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("wrong choice, try again");
                    break;
            }
        } while (!quit);
        System.out.println("Bye bye");

    }
}
