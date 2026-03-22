package mediator.components;

import mediator.service.Mediator;

public class Sensor extends Component {

    public Sensor(Mediator mediator) {
        super(mediator);
    }

    public void detectSmoke() {
        System.out.println("Sensor: Detected ...SMOKE");
        mediator.notify(this, "SMOKE");
    }

    public void detectMotion() {
        System.out.println("Sensor: Detected ...MOTION");
        mediator.notify(this, "MOTION");
    }
}
