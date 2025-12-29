package Step_1_Essential_Fundamentals.Additional_Java_Core.Exception_Handling.The_Bank_Account;

public class Main {
    public static void main(String[] args){
        //ArithmeticException is a standard, easy-to-use exception, but we can create a custom one called InsufficientBalanceException.

        BankAccount bankAccount = new BankAccount(2000);

        try {
            bankAccount.withdraw(2400);
        }catch (InsufficientBalanceException e){
            System.out.println("Your Balance is insufficient1");
        }
    }
}
