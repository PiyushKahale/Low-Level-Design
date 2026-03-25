package decorator.decorators;

import decorator.service.Notifier;
import decorator.wrapper.BaseDecorator;

public class WhatsAppDecorator extends BaseDecorator {

    public WhatsAppDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending what's app message: " + message);
    }
}
