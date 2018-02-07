package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

interface OrderService {
    boolean order(User user, Product product, LocalDate deliveryDate);
}
