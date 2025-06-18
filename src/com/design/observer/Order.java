package com.design.observer;

import java.util.List;
import java.util.ArrayList;

public class Order {

    private String id;
    private int itemCount;
    private double itemCost;
    private double totalPrice;
    private double shippingCost = 10.0;

    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String id) {
        this.id = id;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    // When an order is updated, two monitors:
    // - a Price monitor
    // - a Quantity monitor
    // get notified and perform the following action
    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public void addItem(double price) {
        itemCost = price;
        itemCount++;

        totalPrice += price;

        // Update totalPrice/shippingCost
        notifyObservers();

        System.out.println(
            "Item added: $" + price +
            " | Item cost : " + itemCost +
            " | Item count: " + itemCount +
            " | Total: $" + totalPrice +
            " | Total + Shipping cost: $" + this.getRealTotalPrice() +
            "\n"
        );
    }

    public String getId() {
        return id;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getItemCost() {
        return itemCost;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Total price with shipping cost accounted in
    public double getRealTotalPrice() {
        return totalPrice + shippingCost;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
