package strategy.impl;

import strategy.service.DiscountStrategy;

public class NoDiscount implements DiscountStrategy {

    public NoDiscount() {}

    @Override
    public double applyDiscount(double price) {
        System.out.println("No discount, price will be: " + price);
        return price;
    }
}
