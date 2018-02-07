package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderService implements OrderService {

    public boolean order(User user, Product product, LocalDate localDate) {
        System.out.println("Dear " + user.getNickname() + " - You have ordered: " + product.getProductName() +
                ". Planned delivery date is " + localDate.plusDays(3) + ".");
        return true;
    }
}
