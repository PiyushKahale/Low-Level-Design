package proto;

import impl.Device;
import service.Prototype;

import java.util.ArrayList;
import java.util.List;


public class SmartScene implements Prototype {

    String sceneName;
    List<Device> devices;

    public SmartScene(String name, List<Device> devices) {
        this.sceneName = name;
        this.devices = devices;
    }

    @Override
    public SmartScene clone() {
        // STEP 1: Create a new list for the clone
        List<Device> clonedDevices = new ArrayList<>();

        // STEP 2: Deep Copy - Loop through every device and copy it
        for (Device d : this.devices) {
            clonedDevices.add(d.clone());
        }

        return new SmartScene(this.sceneName, clonedDevices);
    }
}
