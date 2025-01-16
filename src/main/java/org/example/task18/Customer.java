package org.example.task18;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

}
