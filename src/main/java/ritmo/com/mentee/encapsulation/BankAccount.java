package ritmo.com.mentee.encapsulation;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String acc,String name){
        accountNumber = acc;
        ownerName = name;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void deposit(double amount){
        if ( amount <=0) throw new IllegalArgumentException();
        balance += amount;
    }
    public void deposit(int amount){
        double newAmount = (double) amount;
        deposit(newAmount);
    }
    public void withdraw(int amount){
        if (amount <=0 || amount > balance) throw new IllegalArgumentException();
        balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
