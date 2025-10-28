// package domain;

// import java.util.Map;
import java.util.UUID;

import domain.Account;
import domain.AccountRepository;
import domain.BankService;

public class BankServiceImpl implements BankService {

    private final AccountRepository accountRepository = new AccountRepository();

    @Override
    public String OpenAccount(String name, String email, String accountType, double initialDeposit) {
        // generate customer id
        String customerId = UUID.randomUUID().toString();

        // generate readable account number with prefix "AC"
        String accountNumber = "AC" + UUID.randomUUID().toString().replace("-", "").substring(0, 8);

        // Create account object
        // --- Use the constructor you already used earlier:
        //     new Account(accountNumber, customerId, balance, accountType)
        // If your Account class has more fields (name/email), set them with setters if available.
        Account account = new Account(accountNumber, customerId, initialDeposit, accountType);

        

        // Save to repository
        accountRepository.save(account);

        // Print confirmation
        System.out.println("Account opened successfully.");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer ID  : " + customerId);
        System.out.println("Name         : " + name);
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance      : " + initialDeposit);
        return accountNumber;
    
        // return account;
    }

    @Override
    public void openAccount(String name, String email, String accountType, double initialDeposit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'openAccount'");
    }

    // If your BankService interface requires another method signature (e.g. openAccount lowercase),
    // implement it here to delegate to the primary one:
    // @Override
    // public String OpenAccount(String a, String b, String c, double d) {
    //     // If your interface declares a different return type we must match it.
    //     // For now, if interface actually requires String return, you should change the interface
    //     // or implement accordingly. This placeholder throws to make compile failures visible.
    //     throw new UnsupportedOperationException("Please align interface BankService with this implementation.");
    // }
}
