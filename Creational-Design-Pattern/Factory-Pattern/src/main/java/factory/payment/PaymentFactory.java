package factory.payment;

import factory.impl.CreditCardPayment;
import factory.impl.PaypalPayment;
import factory.service.Payment;

public class PaymentFactory {

    public Payment getPaymentMethod(String type) {
        if(type == null || type.isEmpty()) return null;

        switch (type) {
            case "Paypal":
                return new PaypalPayment();

            case "Creditcard":
                return new CreditCardPayment();

            default:
                throw new IllegalArgumentException("Type now given.....");
        }
    }
}
