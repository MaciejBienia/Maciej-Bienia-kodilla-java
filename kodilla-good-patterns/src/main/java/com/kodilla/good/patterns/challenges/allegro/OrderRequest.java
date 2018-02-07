package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class OrderRequest {
    public User user;
    public Product product;
    public LocalDate deliveryDate;

    public OrderRequest(User user, Product product, LocalDate deliveryDate) {
        this.user = user;
        this.product = product;
        this.deliveryDate = deliveryDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
}
