package observer.impl;

import observer.service.StockObserver;

public class BargainHunter implements StockObserver {

    @Override
    public void update(String name, double price) {
        if(price < 100) {
            System.out.println("Buying stock: " + name + " with price: " + price);
        } else {
            System.out.println("Not buying stock: " + name + " with price: " + price);
        }
    }
}
