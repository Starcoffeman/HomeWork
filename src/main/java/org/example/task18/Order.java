package org.example.task18;

import lombok.Getter;
import org.example.task11.Product;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {
    private List<Product> products;
    private String orderId;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalCost() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }
}
