package adaptor.adaptee;

public class OldSchoolBank {

    public void makeTransaction(int amountInCents) {
        System.out.println("Making transaction...with amount: " + amountInCents);
    }
}
