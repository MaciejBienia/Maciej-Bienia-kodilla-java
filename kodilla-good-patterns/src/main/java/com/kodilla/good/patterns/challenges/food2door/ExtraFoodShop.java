package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Supplier {

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Welcome to: " + SupplierFactory.EXTRA + ". You have just ordered: "
                + orderRequest.getProduct().getProductName() + ". Quantity: " + orderRequest.getProductQuantity() + ".");
    }
}
