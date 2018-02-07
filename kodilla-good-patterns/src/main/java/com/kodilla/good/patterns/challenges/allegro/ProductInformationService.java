package com.kodilla.good.patterns.challenges.allegro;

public class ProductInformationService implements InformationService {
    public void inform(User user) {
        System.out.println(user.getNickname() + ": Your order is now being processed..");
    }
}
