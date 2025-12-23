package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Super_Banking_System;

public abstract class Account {
    private String accountNumber;
    private double balance;
    private String holderName;

    public Account(String accountNumber, double balance, String holderName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderName = holderName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getHolderName(){
        return holderName;
    }

    public void setHolderName(String holderName){
        this.holderName = holderName;
    }



    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if (balance >= amount){
            this.balance -= amount;
        } else{
            System.out.println("invalid");
        }

    }

}
