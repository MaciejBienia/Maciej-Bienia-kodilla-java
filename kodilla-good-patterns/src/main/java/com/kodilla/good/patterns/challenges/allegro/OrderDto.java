package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class OrderDto {
    public User user;
    public Product product;
    public LocalDate deliveryDate;

    public OrderDto(User user, Product product, LocalDate deliveryDate) {
        this.user = user;
        this.product = product;
        this.deliveryDate = deliveryDate;
    }
}
