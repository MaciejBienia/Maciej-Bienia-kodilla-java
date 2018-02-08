package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequestRetriever {

    public OrderRequest retrieve(String supplierName) {
        Supplier supplier = SupplierFactory.getSupplier(supplierName);
        Product freshFish = new Product("Fresh Fish", 3);
        return new OrderRequest(supplier, freshFish, freshFish.getProductQuantity());
    }
}
