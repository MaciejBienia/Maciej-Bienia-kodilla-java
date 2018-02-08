package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Supplier {

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Hello! It's " + SupplierFactory.GLUTEN + ". You order is being processed ("
                + orderRequest.getProductQuantity() + " * " + orderRequest.getProduct().getProductName() + ").");
    }
}
