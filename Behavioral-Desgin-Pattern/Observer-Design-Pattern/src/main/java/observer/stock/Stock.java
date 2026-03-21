package observer.stock;

import observer.service.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private String name;
    private double price;

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    List<StockObserver> stockObservers = new ArrayList<>();

    public void addObserver(StockObserver observer) {
        stockObservers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        stockObservers.remove(observer);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers(this.price);
    }

    public void notifyObservers(double price) {
        for(StockObserver observer : stockObservers) {
            observer.update(name, price);
        }
    }
}
