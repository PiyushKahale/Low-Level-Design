package observer.service;

public interface StockObserver {
    void update(String stockName, double price);
}
