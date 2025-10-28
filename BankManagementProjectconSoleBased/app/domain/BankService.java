package domain;

public interface BankService {
    String OpenAccount(String name, String email, String accountType, double initialDeposit);
    // you can add more methods like deposit, withdraw, etc.
    void openAccount(String name, String email, String accountType, double initialDeposit);
}
