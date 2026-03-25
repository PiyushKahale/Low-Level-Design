package decorator.decorators;

import decorator.service.Notifier;
import decorator.wrapper.BaseDecorator;

public class SMSDecorator extends BaseDecorator {

    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SMS: " + message);
    }
}
