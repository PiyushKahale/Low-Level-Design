package strategy.impl;

import strategy.service.DiscountStrategy;

public class ByOneGetOneDiscount implements DiscountStrategy {

    public ByOneGetOneDiscount() {}

    @Override
    public double applyDiscount(double price) {
        System.out.println("By one get one offer will be apply on price: " + price);

        if (price > 1000) {
            price = price - (price * 30 / 100);
        } else {
            price = price - (price * 5 / 100);
        }

        return price;
    }
}
