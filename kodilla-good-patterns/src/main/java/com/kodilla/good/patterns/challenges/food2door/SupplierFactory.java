package com.kodilla.good.patterns.challenges.food2door;

public class SupplierFactory {
    public static final String HEALTHY = "HealthyFoodShop";
    public static final String GLUTEN = "GlutenFreeShop";
    public static final String EXTRA = "ExtraFoodShop";

    public static Supplier getSupplier(String supplierName) {
        switch (supplierName) {
            case HEALTHY: return new HealthyShop();
            case GLUTEN: return new GlutenFreeShop();
            case EXTRA: return new ExtraFoodShop();
            default: return null;
        }
    }
}
