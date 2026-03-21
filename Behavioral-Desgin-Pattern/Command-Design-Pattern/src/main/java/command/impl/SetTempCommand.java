package command.impl;

import command.devices.Light;
import command.devices.ThermoStat;
import command.service.Command;

import java.util.Stack;

public class SetTempCommand implements Command {

    private ThermoStat thermoStat;
    private int temp;
    private int oldTemp;

    public SetTempCommand(ThermoStat thermoStat, int temp) {
        this.thermoStat = thermoStat;
        this.temp = temp;
    }

    @Override
    public void execute() {
        oldTemp = thermoStat.getTemp();
        thermoStat.setTemp(temp);
    }

    @Override
    public void undo() {
        thermoStat.setTemp(oldTemp);
    }
}
