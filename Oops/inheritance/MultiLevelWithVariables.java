// Base Class
class Bank {
    String bankName = "Generic Bank";

    void displayBank() {
        System.out.println("Bank Name: " + bankName);
    }
}

// Intermediate Class
class Account extends Bank {
    String accountType = "General Account";

    void displayAccount() {
        // using parent + child variable
        System.out.println("Bank: " + bankName + ", Account Type: " + accountType);
    }
}

// Derived Class
class SavingsAccount extends Account {
    double interestRate = 5.5;   // child-specific variable
    String accountType = "Savings Account";  // reused (overrides) parent variable

    void displaySavings() {
        System.out.println("Bank: " + bankName + ", Account Type: " + accountType + ", Interest Rate: " + interestRate + "%");
    }
}

// Main Class
public class MultiLevelWithVariables {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();

        // From Bank
        sa.displayBank();

        // From Account (uses parent + its own variable)
        sa.displayAccount();

        // From SavingsAccount (reuses accountType variable + adds interestRate)
        sa.displaySavings();

        // Direct variable access
        System.out.println("\nDirect Access:");
        System.out.println("Bank Name: " + sa.bankName);     // from Bank
        System.out.println("Account Type: " + sa.accountType); // from SavingsAccount (overrides parent)
        System.out.println("Interest Rate: " + sa.interestRate + "%");
    }
}
