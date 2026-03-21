package impl;

import service.Prototype;

public class Device implements Prototype {

    String type;
    public int settings;

    public Device(String type, int settings) {
        this.type = type;
        this.settings = settings;
    }

    @Override
    public Device clone() {
        return new Device(this.type, this.settings);
    }

}
