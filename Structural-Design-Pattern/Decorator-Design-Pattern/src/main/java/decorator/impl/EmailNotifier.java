package decorator.impl;

import decorator.service.Notifier;

public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending e-mail: " + message);
    }
}
