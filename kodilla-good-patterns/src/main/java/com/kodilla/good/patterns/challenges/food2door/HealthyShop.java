package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Supplier {

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("!!! " + SupplierFactory.HEALTHY + " !!! \nYour order: "
                + orderRequest.getProduct().getProductName() + "\nQuantity: " + orderRequest.getProductQuantity() +
                "\n\nWe deliver it as soon as possible! \nThanks for shopping with " + SupplierFactory.HEALTHY + "!");
    }
}
