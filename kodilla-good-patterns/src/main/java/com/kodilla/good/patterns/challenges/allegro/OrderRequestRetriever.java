package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("johnyjohny");
        Product product = new Product("Samsung Galaxy S8");
        LocalDate deliveryDate = LocalDate.now();
        return new OrderRequest(user, product, deliveryDate);
    }
}
