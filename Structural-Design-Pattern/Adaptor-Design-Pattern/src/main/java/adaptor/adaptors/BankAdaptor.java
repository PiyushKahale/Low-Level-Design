package adaptor.adaptors;

import adaptor.adaptee.OldSchoolBank;
import adaptor.service.PaymentProcessor;

public class BankAdaptor implements PaymentProcessor {

    private OldSchoolBank oldSchoolBank;

    public BankAdaptor(OldSchoolBank oldSchoolBank) {
        this.oldSchoolBank = oldSchoolBank;
    }

    @Override
    public void processPayment(double amount) {
        double multipliedAmount = amount * 100;
        int amnt = (int)  multipliedAmount;
        oldSchoolBank.makeTransaction(amnt);
    }
}
