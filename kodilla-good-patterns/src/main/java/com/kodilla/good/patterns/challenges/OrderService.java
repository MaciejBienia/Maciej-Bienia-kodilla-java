package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

interface OrderService {
    boolean order(User user, Product product, LocalDate deliveryDate);
}
