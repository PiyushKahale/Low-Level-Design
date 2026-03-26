package proxxy;


import proxxy.proxies.ReportProxy;
import proxxy.service.Report;

public class Main {
    public static void main(String[] args) {

        // 1. Create the proxy (This should be instant! No loading message yet)
        Report report = new ReportProxy("USER");
        report.display();

        // 2. Create another proxy for Admin
        Report adminReport = new ReportProxy("ADMIN");
        System.out.println("Proxy created. No heavy loading yet...");
        // 3. Trigger the heavy work only now
        adminReport.display();

        // 4. Trigger again (It should NOT reload from DB, it should use the existing object)
        adminReport.display();
    }
}