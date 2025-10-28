package domain;

public class Account {
    private String accountNumber;
    private String customerId;
    private Double balance;
    private String accoutType;

    public Account(String accountNumber, String customerId, Double balance, String accoutType) {
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.balance = balance;
        this.accoutType = accoutType;
    }

    // gatetter define
  public  String gateAccountNumber() {
        return accountNumber;
    }

  public  String GateCustid() {
        return customerId;
    }

   public Double gateBalance() {
        return balance;
    }

  public  String gateaccType() {
        return accoutType;
    }

  public void setName(String name) {
    
  }

  public void setEmail(String email) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setEmail'");
  }

}
