package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Super_Banking_System;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addAccount(new CheckingAccount("12345", 1500.0, "Anderson"));
        bank.addAccount(new SavingsAccount("89076", 2000.0, "Eduardo"));

        bank.generateTaxReport();

    }
}
