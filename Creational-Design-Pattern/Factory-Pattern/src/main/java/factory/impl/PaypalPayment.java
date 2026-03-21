package factory.impl;

import factory.service.Payment;

public class PaypalPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Using paypal payment processing with amount: " + amount);
    }
}
