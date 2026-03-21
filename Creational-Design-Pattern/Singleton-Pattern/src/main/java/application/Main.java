package application;

import manager.ConfigManager;
import modern.ModernSingleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConfigManager config1 = ConfigManager.getInstance();
        System.out.println("Instance 1:" + config1);

        ConfigManager config2 = ConfigManager.getInstance();
        System.out.println("Instance 2:" + config2);


        Runnable task = () -> {
            ModernSingleton config = ModernSingleton.getInstance();
            System.out.println("Thread: " + Thread.currentThread().getName() + "| Got Instance: " + config);
        };

        Thread t1 =  new Thread(task);
        Thread t2 =  new Thread(task);
        Thread t3 =  new Thread(task);
        Thread t4 =  new Thread(task);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


//        Output :
//        Critical : sleeping thread for 2 seconds
//        Instance 1:manager.ConfigManager@3feba861
//        Instance 2:manager.ConfigManager@3feba861
//        Thread: Thread-0Got Instance: manager.ConfigManager@3feba861
//        Thread: Thread-1Got Instance: manager.ConfigManager@3feba861
//        Thread: Thread-3Got Instance: manager.ConfigManager@3feba861
//        Thread: Thread-2Got Instance: manager.ConfigManager@3feba861
//
//        Process finished with exit code 0
    }
}