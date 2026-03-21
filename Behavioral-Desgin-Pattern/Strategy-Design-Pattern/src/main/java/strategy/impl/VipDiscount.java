package strategy.impl;

import strategy.service.DiscountStrategy;

public class VipDiscount implements DiscountStrategy {

    public VipDiscount() {}

    @Override
    public double applyDiscount(double price) {
        System.out.println("VIP Discount will be apply on price:" + price);
        price = price - (price * 20 / 100);
        return price;
    }
}
