package mediator.components;

import mediator.service.Mediator;

public class Alarm extends Component {

    public Alarm(Mediator mediator) {
        super(mediator);
    }

    public void chirp() {
        System.out.println("Alarm: chirp");
    }

    public void silent() {
        System.out.println("Alarm: stop alarm");
        mediator.notify(this, "ALARM_STOPPED");
    }
}
