package proxxy.proxies;

import proxxy.real.RealReport;
import proxxy.service.Report;

public class ReportProxy implements Report {

    private RealReport realReport;
    private String role;

    public ReportProxy(String userRole) {
        this.role = userRole;
    }

    @Override
    public void display() {
        if (role.equals("ADMIN")) {
            if(realReport == null) {
                realReport = new RealReport();
            }
            realReport.display();
        } else {
            System.out.println("Access Denied for user: " + role);
        }
    }
}
