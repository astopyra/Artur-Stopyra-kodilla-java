package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";


    public final Task createTask(final String taskClass){
        return switch(taskClass) {
            case SHOPPING -> new ShoppingTask("The shopping task", "Milk", 1.0);
            case PAINTING -> new PaintingTask("The painting task", "Blue", "A car");
            case DRIVING -> new DrivingTask("The driving task", "To shopping center", "Motorbike");
            default -> null;
        };
    }
}
