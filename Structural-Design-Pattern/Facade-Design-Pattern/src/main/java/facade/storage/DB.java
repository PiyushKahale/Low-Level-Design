package facade.storage;

import java.util.HashMap;

public class DB {

    private HashMap<Integer, String> users = new HashMap<>();

    public boolean verifyUser(Integer userId, String userName) {
        if(users.get(userId).contains(userName)) {
            System.out.println("User exists....");
            return true;
        } else {
            System.out.println("User doesn't exists....");
            users.put(userId, userName);
            return false;
        }
    }

    public void addUser(Integer userId, String userName) {
        System.out.println("Adding new user...");
        users.put(userId, userName);
    }
}
