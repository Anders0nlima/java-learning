package Step_1_Essential_Fundamentals.Additional_Java_Core.Exception_Handling.The_Bank_Account;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
