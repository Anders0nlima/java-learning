package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Payment_System;

public abstract class PaymentMethod {
    protected double value;

    public PaymentMethod(double value){
        this.value = value;
    }

    public abstract String processPayment();
}
