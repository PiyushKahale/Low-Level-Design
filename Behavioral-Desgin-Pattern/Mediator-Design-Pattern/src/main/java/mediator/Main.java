package mediator;

import mediator.components.Alarm;
import mediator.components.ExhaustFan;
import mediator.components.Sensor;
import mediator.components.SmartLight;
import mediator.mediators.SmartKitchenMediator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SmartKitchenMediator hub = new SmartKitchenMediator();

        Sensor sensor = new Sensor(hub);
        ExhaustFan exhaustFan = new ExhaustFan(hub);
        Alarm alarm = new Alarm(hub);
        SmartLight smartLight = new SmartLight(hub);

        hub.setSensor(sensor);
        hub.setAlarm(alarm);
        hub.setLight(smartLight);
        hub.setFan(exhaustFan);

        sensor.detectSmoke();
        sensor.detectMotion();
        alarm.silent();
    }
}