package factory.factories;

import factory.instances.EUInstance;
import factory.service.CloudFactory;
import factory.service.Instance;
import factory.service.Storage;
import factory.storage.EUStorage;

public class EUCloudFactory implements CloudFactory {

    public Instance createInstance() {
        return new EUInstance();
    }

    public Storage createStorage() {
        return new EUStorage();
    }
}
