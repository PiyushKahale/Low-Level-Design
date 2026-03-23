package template.exporters;

import template.impl.DataExporter;

public class PDFExporter extends DataExporter {

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public void formatData() {
        System.out.println("Formatting PDF data...");
    }
}
