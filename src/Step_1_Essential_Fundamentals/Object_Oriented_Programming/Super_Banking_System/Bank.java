package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Super_Banking_System;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    public void addAccount(Account account){
        accounts.put(account.getAccountNumber(), account);
    }

    public Account getAccount(String number){
        return accounts.get(number);
    }

    public void generateTaxReport(){
        double totalTax = 0.0;
        for(Account acc : accounts.values()){
            if(acc instanceof Taxable){
                Taxable taxableAccount = (Taxable) acc;

                totalTax += taxableAccount.calculateTax();

                System.out.println("Tax collected from " + acc.getAccountNumber() + " : $ " + taxableAccount.calculateTax());
            }
        }

        System.out.println("-----------------------------------------");
        System.out.println("TOTAL TAX COLLECTED BY BANK: $ " + totalTax);
    }
}

