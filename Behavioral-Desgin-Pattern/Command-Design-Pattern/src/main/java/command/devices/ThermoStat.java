package command.devices;

public class ThermoStat {

    private int currTemp;

    public ThermoStat(int initialTemp) {
        currTemp = initialTemp;
    }

    public void setTemp(int temp) {
        currTemp = temp;
        System.out.println("Setting up thermo temperature: " + currTemp);
    }

    public int getTemp() {
        System.out.println("Getting old thermo temperature...");
        return currTemp;
    }
}
