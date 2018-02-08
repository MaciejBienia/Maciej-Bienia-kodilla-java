package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest currentOrder = orderRequestRetriever.retrieve(SupplierFactory.HEALTHY);
        currentOrder.getSupplier().process(currentOrder);
    }
}
