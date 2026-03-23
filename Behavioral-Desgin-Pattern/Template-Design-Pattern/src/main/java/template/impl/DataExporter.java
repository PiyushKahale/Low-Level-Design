package template.impl;

public abstract class DataExporter {

    public final void export() {
        readFromDB();
        if(shouldFilter()) {
            filterData();
        }
        formatData();
        saveToFiles();
        sendNotification();
    }

    private void readFromDB() {
        System.out.println("Fetching data from database...");
    }

    private void saveToFiles() {
        System.out.println("Writing file data to disk...");
    }

    private void sendNotification() {
        System.out.println("Export completed....!");
    }

    protected abstract void formatData();

    protected void filterData() {
        System.out.println("Filtering data...");
    }

    protected boolean shouldFilter() {
        return true;
    }
}
