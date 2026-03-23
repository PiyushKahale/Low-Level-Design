package template;

import template.exporters.CSVExporter;
import template.exporters.PDFExporter;

//The Challenge: The Automated Data Export Tool
//You are building a system for a company that needs to export data to different formats (CSV, PDF, and JSON).
// Every export follows the same security and logging protocol, but the way the data is actually formatted is different for each file type.
//
//        The Workflow (The Template Method):
//Read from Database: (Same for everyone — "Fetching records...")
//
//Filter Data: (Optional "Hook" — Some exports might want to remove sensitive info, others don't.)
//
//Format Data: (Different for CSV, PDF, and JSON.)
//
//Save to File: (Same for everyone — "Writing file to disk...")
//
//Send Notification: (Same for everyone — "Export complete!")


public class Main {
    public static void main(String[] args) {

        PDFExporter pdfExporter = new PDFExporter();
        pdfExporter.export();

        CSVExporter csvExporter = new CSVExporter();
        csvExporter.export();

        PDFExporter pdfExporter2 = new PDFExporter();
        pdfExporter2.export();
    }
}