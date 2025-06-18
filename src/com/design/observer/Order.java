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

    public void addObserver(OrderObserver observer) {
        // TODO To implement
    }

    public void removeObserver(OrderObserver observer) {
        // TODO To implement
    }

    public void notifyObservers() {
        // TODO To implement
    }

    public void addItem(double price) {
        // TODO To implement
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

    public double getShippingCost() {
        return shippingCost;
    }

}
