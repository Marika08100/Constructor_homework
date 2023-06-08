public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;


    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }
    public String getAccountHolder(){
        return this.accountHolder;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
