package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Super_Banking_System;

public class CheckingAccount extends Account implements Taxable{

    public CheckingAccount(String accountNumber, double balance, String holderName){
        super(accountNumber, balance, holderName);
    }

    @Override
    public double calculateTax() {
        return getBalance() * 0.1;
    }
}
