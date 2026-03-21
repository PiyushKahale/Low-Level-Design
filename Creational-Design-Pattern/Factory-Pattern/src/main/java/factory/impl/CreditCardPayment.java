package factory.impl;

import factory.service.Payment;

public class CreditCardPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Using credit card payment processing with amount: " + amount);
    }
}
