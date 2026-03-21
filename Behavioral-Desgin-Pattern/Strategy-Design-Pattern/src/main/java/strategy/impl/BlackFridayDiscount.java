package strategy.impl;

import strategy.service.DiscountStrategy;

public class BlackFridayDiscount implements DiscountStrategy {

    public BlackFridayDiscount() {}

    @Override
    public double applyDiscount(double price) {
        System.out.println("Black Friday discount will be apply on price: " + price);
        price = price - (price * 10 / 100);
        return price;
    }
}
