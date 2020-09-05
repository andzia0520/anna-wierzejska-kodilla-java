package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping for weekend", "bread", 3.5);
            case PAINTINGTASK:
                return new PaintingTask("Paint car", "blue", "Audi Q7");
            case DRIVINGTASK:
                return new DrivingTask("Go for weekend trip", "Lublin", "car");
            default:
                return null;
        }
    }
}
