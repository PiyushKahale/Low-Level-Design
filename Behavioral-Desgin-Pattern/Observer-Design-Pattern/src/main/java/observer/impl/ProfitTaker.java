package observer.impl;

import observer.service.StockObserver;

public class ProfitTaker implements StockObserver {

    @Override
    public void update(String name, double price) {
        if(price > 150) {
            System.out.println("Selling stock: "+ name + " price is updated, price: " + price);
        } else {
            System.out.println("Not selling stock: "+ name + " price is updated, price: " + price);
        }
    }
}
