package factory.instances;

import factory.service.Instance;

public class EUInstance implements Instance {

    @Override
    public void launch() {
        System.out.println("Launching EU Instance: b1.small");
    }
}
