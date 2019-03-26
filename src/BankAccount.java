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
                    balance = amount + balance;
                    System.out.println("Your balance: " + balance + "$");
                    break;
                case 2:
                    System.out.println("Amount to winthdrawl: ");
                    amount = scanner.nextFloat();
                    balance = amount - balance;
                    System.out.println("Your balance: " + balance + "$");
                    break;
                case 3:
                    System.out.println("Your balance: " + balance + "$");
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println();
                    break;
            }
        } while (!quit);
        System.out.println("Bye bye");

    }
}
