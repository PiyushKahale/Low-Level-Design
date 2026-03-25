package decorator.wrapper;

import decorator.service.Notifier;

public abstract class BaseDecorator implements Notifier {

    protected Notifier notifier;

    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
