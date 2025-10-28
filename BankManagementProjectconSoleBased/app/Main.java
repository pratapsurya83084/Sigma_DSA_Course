

import java.util.Scanner;

import domain.BankService;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to console bank");

        boolean isTrue = true;
        Scanner sc = new Scanner(System.in);

        while (isTrue) {
            System.out.println("""
                    1) Open Account
                    2) Deposit
                    3) Withdraw
                    4) Transfer
                    5) Account Statements
                    6) List Account
                    7) Search Accounts by Name
                    0) Exit
                    """);

            System.out.print("enter choice : ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "0":
                    isTrue = false;
                    break;
                case "1":
                    openAccount(sc);
                    break;
                case "2":
                    deposit(sc);
                    break;
                case "3":
                    withdraw(sc);
                    break;
                case "4":
                    transfer(sc);
                    break;
                case "5":
                    accountStatement(sc);
                    break;
                case "6":
                    listAccount();
                    break;
                case "7":
                    searchAccount(sc);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }

    public static void openAccount(Scanner sc) {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter account type: ");
        String accountType = sc.nextLine();
        System.out.print("Enter initial deposit: ");
        // Read as line and parse to avoid leftover newline problems
        double deposit = 0.0;
        try {
            String depLine = sc.nextLine().trim();
            deposit = Double.parseDouble(depLine);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Setting initial deposit to 0.0");
        }

        BankService service = new BankServiceImpl(); // upcast 
        service.OpenAccount(name, email, accountType, deposit);
       
    }

    private static void deposit(Scanner sc) {
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }
    private static void withdraw(Scanner sc) {
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }
    private static void transfer(Scanner sc) {
        throw new UnsupportedOperationException("Unimplemented method 'transfer'");
    }
    private static void accountStatement(Scanner sc) {
        throw new UnsupportedOperationException("Unimplemented method 'accountStatement'");
    }
    private static void listAccount() {
        throw new UnsupportedOperationException("Unimplemented method 'listAccount'");
    }
    private static void searchAccount(Scanner sc) {
        throw new UnsupportedOperationException("Unimplemented method 'searchAccount'");
    }
}
