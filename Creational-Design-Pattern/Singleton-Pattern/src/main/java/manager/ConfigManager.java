package manager;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {

    private static volatile ConfigManager instance;
    private Map<String, String> config = new HashMap<>();

    private ConfigManager() {
        try {
            System.out.println("Critical : sleeping thread for 2 seconds");
            Thread.sleep(2000);
            config.put("theme", "dark");
            config.put("theme", "light");
            config.put("version", "1.0.0");
        } catch (InterruptedException ex) {

        }
    }

    public static ConfigManager getInstance() {
        if(instance == null) { // 1st check for NO LOCKING
            synchronized (ConfigManager.class) { // For Multithreading purpose
                if(instance == null) { // 2nd check for NO LOCKING
                    instance = new ConfigManager();
                }
            }
        }
        return instance;
    }

    public String getKey(String key) {
        return config.get(key);
    }
}
