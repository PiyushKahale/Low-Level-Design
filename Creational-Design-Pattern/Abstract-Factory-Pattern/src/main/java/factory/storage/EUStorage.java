package factory.storage;

import factory.service.Storage;

public class EUStorage implements Storage {

    @Override
    public void attach() {
        System.out.println("Attaching EU Storage: Standard HDD");
    }
}
