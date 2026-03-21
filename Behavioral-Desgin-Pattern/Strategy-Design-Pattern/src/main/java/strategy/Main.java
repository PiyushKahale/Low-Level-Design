package strategy;

import strategy.carts.ShoppingCart;
import strategy.impl.VipDiscount;
//
//🛠️ The Challenge: The "Flexible Discount" System
//You are building an e-commerce backend for a store called "JavaMart."
// The store has different discount rules depending on the day or the type of customer.
//
//        The Problem:
//Currently, the Checkout class is a mess of if-else statements:
//
//No Discount: Standard price.
//
//Flat Discount: $20 off for VIPs.
//
//Percentage Discount: 10% off for "Black Friday."
//
//Buy One Get One (BOGO): If they buy 2 items, the second is free.
//
//Every time the marketing team adds a new promotion (like "Valentine's Day 5% off"),
// you have to open the Checkout class and add another else-if.
// This breaks the Open/Closed Principle.

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart1 = new ShoppingCart();
        cart1.addItem(450);
        cart1.addItem(550);

        cart1.setStrategy(new VipDiscount());
        System.out.println("Total price with discount: " + cart1.calculateTotalPrice());
    }
}