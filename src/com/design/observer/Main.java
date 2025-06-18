package com.design.observer;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Order 1");
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        order.attach(priceObserver);
        order.attach(quantityObserver);

        order.addItem(30.50);
        order.addItem(47.2);
        order.addItem(60);
        order.addItem(23.99);
        order.addItem(50.25);

        // Quantity observer --> should set shipping cost to $0 : count (item count) > 5
        order.addItem(20);

        // Price observer --> should provide discount : totalPrice > 200
        order.addItem(100);

        order.detach(priceObserver);
        order.detach(quantityObserver);
    }
}