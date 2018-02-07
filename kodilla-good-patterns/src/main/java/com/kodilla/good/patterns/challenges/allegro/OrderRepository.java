package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

interface OrderRepository {
    void createOrder(User user, Product product, LocalDate deliveryDate);
}
