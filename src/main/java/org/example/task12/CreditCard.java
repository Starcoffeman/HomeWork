package org.example.task12;

public class CreditCard implements PaymentSystem {
    public void pay() {
        System.out.println("Paying with Credit Card");
    }

    public void refund() {
        System.out.println("Refunding via Credit Card");
    }
}
