package mediator.service;

import mediator.components.Component;

public interface Mediator {

    // The component says WHO it is, and WHAT happened.
    void notify(Component sender, String event);
}
