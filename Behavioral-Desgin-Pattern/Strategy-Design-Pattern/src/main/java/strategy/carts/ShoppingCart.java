package strategy.carts;

import strategy.service.DiscountStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Double> items = new ArrayList<>();

    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public void addItem(double price) {
        items.add(price);
    }

    public double calculateTotalPrice() {
        double sum = items.stream().mapToDouble(Double::doubleValue).sum();

        if(strategy == null) return sum;
        return strategy.applyDiscount(sum);
    }
}
