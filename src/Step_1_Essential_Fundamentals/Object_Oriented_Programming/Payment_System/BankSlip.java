package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Payment_System;

public class BankSlip extends PaymentMethod{

    public BankSlip(double value){
        super(value);
    }
    @Override
    public String processPayment() {
        return "Payment of R$ " + value +"processed via bank slip. Due in 3 days.";
    }
}
