package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Super_Banking_System;

public class SavingsAccount extends Account{

    public SavingsAccount(String accountNumber, double balance, String holderName){
        super(accountNumber, balance, holderName);
    }

    public void applyInterest(double rate){
        double interest = getBalance() * rate;
        deposit(interest);
    }

}
