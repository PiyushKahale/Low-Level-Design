package observer;

import observer.impl.BargainHunter;
import observer.impl.ProfitTaker;
import observer.service.StockObserver;
import observer.stock.Stock;

//
//📈 The Challenge: The "Stock Alert" System
//You are building a Stock Market Tracker. Investors want to be notified immediately when a specific stock price hits a certain "target."
//
//The Scenario
//The Subject: A class called Stock (e.g., Apple, Google, or Tesla). It has a price.
//
//The Observers: Investors. They don't just want any update; they want to react based on the price.
//
//The "Buy" Investor: Wants to be notified so they can buy when the price drops below $100.
//
//The "Sell" Investor: Wants to be notified to sell when the price goes above $150.

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stock apple = new Stock("Apple", 120.0);

        StockObserver buyer = new BargainHunter();
        StockObserver seller = new ProfitTaker();

        apple.addObserver(buyer);
        apple.addObserver(seller);

        System.out.println("--- Market Update: Price drops ---");
        apple.setPrice(85.0);

        System.out.println("\n--- Market Update: Price recovers ---");
        apple.setPrice(125.5);

        System.out.println("\n--- Market Update: Price rockets ---");
        apple.setPrice(165.8);
    }
}