
import java.util.Scanner;


public class Account {
    
    public int number;
    public double balance;

    public Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public void deposit(){
        
       Scanner iput = new Scanner(System.in); 
       System.out.println("Enter Amount to diposite:");
       double amount =iput.nextDouble();
       
       if(amount >= 0){
           this.balance +=amount;
       }
       else{
           System.out.println("Invalid Amount!");
       }
    }
    public void withdraw(){
        
        Scanner iput = new Scanner(System.in); 
       System.out.println("Enter Amount to Withdraw:");
       double amount =iput.nextDouble();
       
       if(amount >= 0 && this.balance>amount){
           
           this.balance -= amount;
                      
       }
       else{
           System.out.println("Invalid Amount!");
       }
        
    }
      
}

class CurrentAccount extends Account{
    
    public int accountNo;

    public CurrentAccount(int accountNo, int number, int balance) {
        super(number, balance);
        this.accountNo = accountNo;
    }
    
    @Override
    public void withdraw(){
        
    }
    
}
class SavingAccount extends Account{
    
    public int accountNo;

    public SavingAccount(int accountNo, int number, int balance) {
        super(number, balance);
        this.accountNo = accountNo;
    }
    
    
    
}
class Customer{
    public String name;
    public String address;
    public String dob;
    public int cardNumber;
    public int pin;

    public Customer(String name, String address, String dob, int cardNumber, int pin) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.cardNumber = cardNumber;
        this.pin = pin;
    }
    
    public void verifyPassword(){
        
    }
    
}
class Bank{
    
    public int code;
    public String address;

    public Bank(int code, String address) {
        this.code = code;
        this.address = address;
    }    
    
}
class ATM{
    public String locaton;
    public String managedby;

    public ATM(String locaton, String managedby) {
        this.locaton = locaton;
        this.managedby = managedby;
    }
 
    
}
class ATMTransactions{
    
    public int transactionId;
    public int date;
    public String type;
    public int amount;
    public int postBalance;

    public ATMTransactions(int transactionId, int date, String type, int amount, int postBalance) {
        this.transactionId = transactionId;
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.postBalance = postBalance;
    }
    
    
    
    public void modifies(){
        
    }
    
    
}

