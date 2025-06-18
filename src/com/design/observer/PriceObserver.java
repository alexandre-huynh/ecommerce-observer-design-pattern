package com.design.observer;

public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        // 1. If the cost of the order is more than $200, the Price monitor:
        // - provides a $20 discount
        // - updates the order's total price by subtracting the discount amount.

        // Note: with this method to respect the instructions,
        // if an item is removed and the order's total price goes back below $200,
        // the discount would still have been applied since we've subtracted
        // the amount directly from the total.
        // It would be better to have a
        if (order.getTotalPrice() > 200) {
            double discount = 20;
            double newTotal = order.getTotalPrice() - discount;

            order.setTotalPrice(newTotal);

            System.out.println("PriceObserver --> $20 discount, new total = $" + newTotal);

        }
    }
}
