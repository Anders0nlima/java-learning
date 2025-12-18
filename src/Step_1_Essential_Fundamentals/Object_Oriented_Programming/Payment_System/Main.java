package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Payment_System;

public class Main {
    public static void main(String[] args) {
        PaymentMethod p1 = new CreditCard(250.0);
        PaymentMethod p2 = new BankSlip(150.0);

        System.out.println(p1.processPayment());
        System.out.println(p2.processPayment());
    }
}
