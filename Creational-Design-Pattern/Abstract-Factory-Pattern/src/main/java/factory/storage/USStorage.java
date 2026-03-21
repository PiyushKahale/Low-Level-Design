package factory.storage;

import factory.service.Storage;

public class USStorage implements Storage {

    @Override
    public void attach() {
        System.out.println("Attaching US Storage: EBS Volume");
    }
}
