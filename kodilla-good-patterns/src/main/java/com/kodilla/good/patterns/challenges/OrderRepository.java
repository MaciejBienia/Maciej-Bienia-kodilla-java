package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

interface OrderRepository {
    void createOrder(User user, Product product, LocalDate deliveryDate);
}
