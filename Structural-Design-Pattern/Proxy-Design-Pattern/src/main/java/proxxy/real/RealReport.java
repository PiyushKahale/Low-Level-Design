package proxxy.real;

import proxxy.service.Report;

public class RealReport implements Report {

    public RealReport() {
        System.out.println("Loading massive data from Database... (takes 5 seconds)");
    }

    @Override
    public void display() {
        System.out.println("Displaying the High-Resolution Report Contents");
    }
}
