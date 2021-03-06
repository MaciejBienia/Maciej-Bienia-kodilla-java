package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {
    private Supplier supplier;
    private Product product;
    private int productQuantity;

    public OrderRequest(Supplier supplier, Product product, int productQuantity) {
        this.supplier = supplier;
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
