package adaptor;


import adaptor.adaptee.OldSchoolBank;
import adaptor.adaptors.BankAdaptor;

public class Main {
    public static void main(String[] args) {

        OldSchoolBank oldSchoolBank = new OldSchoolBank();

        BankAdaptor adaptor = new BankAdaptor(oldSchoolBank);
        adaptor.processPayment(19.99);
    }
}