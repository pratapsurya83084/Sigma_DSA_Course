package domain;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AccountRepository {
    // key: accountNumber (String), value: Account
    private final Map<String, Account> accountByNumber = new HashMap<>();

    // save account
    public void save(Account account){
        accountByNumber.put(account.gateAccountNumber(), account); // key is accNo and val is account object
    }

    // getter for all accounts - strongly typed
    public Map<String, Account> getAllAccounts(){
        // return unmodifiable view to avoid external modification if you want safety
        return Collections.unmodifiableMap(accountByNumber);
        // or just return accountByNumber if you want mutable access
    }
}
