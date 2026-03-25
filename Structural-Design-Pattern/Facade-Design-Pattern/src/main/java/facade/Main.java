package facade;


import facade.facade.CloudStorageFacade;
import facade.storage.DB;

public class Main {
    public static void main(String[] args) {
        DB db = new DB();

        db.addUser(1, "piyush");
        db.addUser(2, "rahul");
        db.addUser(3, "aditya");

        byte[] data = new byte[0];

        CloudStorageFacade facade = new CloudStorageFacade(db);
        facade.saveFile(1, "piyush", data);
    }
}