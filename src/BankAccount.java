import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        int userChoose;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your operation type: ");
        System.out.println("deposit money - press 1");
        System.out.println("withdrawl money - press 2");
        System.out.println("saldo check - press 3");
        System.out.println("quit - press 0");

        userChoose = scanner.nextInt();

        switch (userChoose) {
            case 1:
                //deposit money
                break;
            case 2:
                //withdrawl money
                break;
            case 3:
                //saldo check
                break;
            case 0:
                //quit
                break;
            default:
                System.out.println();
                break;
        }

    }
}
