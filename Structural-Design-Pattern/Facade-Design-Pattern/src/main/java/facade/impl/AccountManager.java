package facade.impl;

import facade.storage.DB;

public class AccountManager {

    private DB db;

    public AccountManager(DB db) {
        this.db = db;
    }

    public boolean validateUser(Integer userId, String userName) {
        if(db.verifyUser(userId, userName)) {
            return true;
        } else {
            return false;
        }
    }
}
