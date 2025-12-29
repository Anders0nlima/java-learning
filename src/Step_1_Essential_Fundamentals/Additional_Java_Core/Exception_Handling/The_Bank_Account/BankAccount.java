package Step_1_Essential_Fundamentals.Additional_Java_Core.Exception_Handling.The_Bank_Account;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;

    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double value) throws InsufficientBalanceException{
        if (value > getBalance()){
            throw new InsufficientBalanceException("Your Balance is insufficient");
        }else{
            balance = getBalance() - value;
            System.out.println("You have: $" + balance);
        }

    }
}
