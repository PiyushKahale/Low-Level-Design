package mediator.components;

import mediator.service.Mediator;

public class ExhaustFan extends Component {

    public ExhaustFan(Mediator mediator) {
        super(mediator);
    }

    public void turnOn() {
        System.out.println("ExhaustFan: turning on fan");
    }

    public void turnOff() {
        System.out.println("ExhaustFan: turning off fan");
    }
}
