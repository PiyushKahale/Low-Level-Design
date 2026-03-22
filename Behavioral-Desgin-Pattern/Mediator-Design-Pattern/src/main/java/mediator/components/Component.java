package mediator.components;

import mediator.service.Mediator;

public abstract class Component {

    protected Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }
}
