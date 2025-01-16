package org.example.task12;

class PayPal implements PaymentSystem {
    public void pay() {
        System.out.println("Paying with PayPal");
    }

    public void refund() {
        System.out.println("Refunding via PayPal");
    }
}