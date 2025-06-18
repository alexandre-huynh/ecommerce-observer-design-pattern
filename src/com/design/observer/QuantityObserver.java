package com.design.observer;

public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        // 2. If the quantity of items in the order is more than 5, the Quantity monitor :
        // - sets the shipping cost of the order to zero
        // --> otherwise the default shipping cost is $10.
        if (order.getItemCount() > 5) {
            order.setShippingCost(0);
            System.out.println("QuantityObserver --> shipping cost = $0 (quantity of items > 5)");

        } else {
            order.setShippingCost(10);
            System.out.println("QuantityObserver --> shipping cost = $10 (default shipping cost)");

        }
    }
}

