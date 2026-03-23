package template.exporters;

import template.impl.DataExporter;

public class CSVExporter extends DataExporter {

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public void formatData() {
        System.out.println("Formatting CSV data...!");
    }
}
