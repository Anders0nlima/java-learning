package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Payment_System;

public class CreditCard extends PaymentMethod {

    public CreditCard(double value){
        super(value);
    }

    @Override
    public String processPayment() {
        return "Payment of R$ " + value + " processed via Credit Card. 5% fee applies.";
    }
}
