package factory.apps;

import factory.service.CloudFactory;
import factory.service.Instance;
import factory.service.Storage;

public class CloudApp {

    private Instance instance;

    private Storage storage;

    public CloudApp(CloudFactory factory) {
        instance = factory.createInstance();
        storage = factory.createStorage();
    }

    public void deploy() {
        instance.launch();
        storage.attach();
        System.out.println("Deployment completed...!");
    }

}