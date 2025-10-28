package domain;

import java.time.LocalDateTime;

public class Transaction {
    public String  id;
    public String  accountNumber;
    public String  amount;
    public LocalDateTime  timeStamp;
    public String note;

    // constructor 
    Transaction(String id,String accountNumber , String amount , LocalDateTime  timeStamp ,String note ){
       this.id = id;
       this.accountNumber = accountNumber;
       this.amount = amount;
       this.timeStamp = timeStamp;
       this.note = note;
    }

}
