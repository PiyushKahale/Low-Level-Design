package factory;

import factory.apps.CloudApp;
import factory.factories.EUCloudFactory;
import factory.factories.USCloudFactory;
import factory.service.CloudFactory;

public class App {
    public static void main(String []args) {

        CloudFactory usRegion1 = new USCloudFactory();
        CloudApp app1 = new CloudApp(usRegion1);
        app1.deploy();

        CloudFactory usRegion2 = new EUCloudFactory();
        CloudApp app2 = new CloudApp(usRegion2);
        app2.deploy();
    }
}
