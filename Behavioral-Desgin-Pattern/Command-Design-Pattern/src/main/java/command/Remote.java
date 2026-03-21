package command;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//The Scenario
//You are building a remote control for a high-end smart home. The home has two devices:
//
//A Light: Can be on() or off().
//
//A Thermostat: Can setTemperature(int).
//
//Your Task
//Implement the Command Pattern so that the user can perform actions, but also undo them in the reverse order they were performed.

import command.devices.Light;
import command.devices.ThermoStat;
import command.impl.LightCommand;
import command.impl.SetTempCommand;
import command.service.Command;

import java.util.Stack;

public class Remote {
    public static void main(String[] args) {

        Light light1 = new Light();
        ThermoStat thermoStat1 = new ThermoStat(20);

        Stack<Command> commandsHistory = new Stack<Command>();

        SetTempCommand setTempCommand = new SetTempCommand(thermoStat1, 25);
        setTempCommand.execute();
        commandsHistory.push(setTempCommand);

        LightCommand lightCommand = new LightCommand(light1);
        lightCommand.execute();
        commandsHistory.push(lightCommand);

        SetTempCommand setTempCommand1 = new SetTempCommand(thermoStat1, 30);
        setTempCommand1.execute();
        commandsHistory.push(setTempCommand1);

        while (!commandsHistory.isEmpty()) {
            Command command = commandsHistory.pop();
            command.undo();
        }
    }
}