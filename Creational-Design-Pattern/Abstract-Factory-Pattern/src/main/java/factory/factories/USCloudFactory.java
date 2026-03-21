package factory.factories;

import factory.instances.USInstance;
import factory.service.CloudFactory;
import factory.service.Instance;
import factory.service.Storage;
import factory.storage.USStorage;

public class USCloudFactory implements CloudFactory {

    public Instance createInstance() {
        return new USInstance();
    }

    public Storage createStorage() {
        return new USStorage();
    }
}
