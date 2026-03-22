package mediator.components;

import mediator.service.Mediator;

public class SmartLight extends Component {

    public SmartLight(Mediator mediator) {
        super(mediator);
    }

    public void turnOn() {
        System.out.println("SmartLight: turned on lights");
    }

    public void turnOff() {
        System.out.println("SmartLight: turned off lights");
    }

}
