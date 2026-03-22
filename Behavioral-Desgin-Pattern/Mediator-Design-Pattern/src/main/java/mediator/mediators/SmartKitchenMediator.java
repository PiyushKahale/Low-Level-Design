package mediator.mediators;

import mediator.components.Alarm;
import mediator.components.Sensor;
import mediator.components.ExhaustFan;
import mediator.components.SmartLight;
import mediator.components.Component;
import mediator.service.Mediator;

public class SmartKitchenMediator implements Mediator {

    private Sensor sensor;
    private ExhaustFan fan;
    private SmartLight light;
    private Alarm alarm;

    @Override
    public void notify(Component sender, String event) {
        if(event.equals("SMOKE")) {
            fan.turnOn();
            alarm.chirp();
        } else if (event.equals("MOTION")) {
            light.turnOn();
        } else if (event.equals("ALARM_STOPPED")) {
            fan.turnOff();
        }
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public void setFan(ExhaustFan fan) {
        this.fan = fan;
    }

    public void setLight(SmartLight light) {
        this.light = light;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }
}
