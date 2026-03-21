package factory.instances;

import factory.service.Instance;

public class USInstance implements Instance {

    @Override
    public void launch() {
        System.out.println("Launching US Instance: t2.micro");
    }

}
