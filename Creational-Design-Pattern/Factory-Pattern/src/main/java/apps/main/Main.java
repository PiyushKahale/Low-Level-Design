package apps.main;

import factory.payment.PaymentFactory;
import factory.service.Payment;

public class Main {
    public static void main(String[] args) {
        PaymentFactory factory = new PaymentFactory();

        Payment myPayment = factory.getPaymentMethod("Paypal");
        myPayment.processPayment(5000);

        Payment myPaymentTwo = factory.getPaymentMethod("Creditcard");
        myPaymentTwo.processPayment(2000);
    }
}