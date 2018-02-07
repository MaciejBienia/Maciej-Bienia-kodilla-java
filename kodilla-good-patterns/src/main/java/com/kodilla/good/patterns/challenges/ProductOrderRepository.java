package com.kodilla.good.patterns.challenges;
import java.time.LocalDate;

public class ProductOrderRepository implements OrderRepository{

    public void createOrder(User user, Product product, LocalDate deliveryDate) {

        System.out.println("Your order has been created successfully!");
    }
}
