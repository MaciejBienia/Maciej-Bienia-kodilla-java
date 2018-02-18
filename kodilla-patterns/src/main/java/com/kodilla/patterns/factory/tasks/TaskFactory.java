package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Morning shopping", "Rolls", 4);
            case PAINTING:
                return new PaintingTask("Summer painting", "White", "Kitchen");
            case DRIVING:
                return new DrivingTask("Long weekend trip", "Croatia", "Car");
            default:
                return null;
        }
    }
}
