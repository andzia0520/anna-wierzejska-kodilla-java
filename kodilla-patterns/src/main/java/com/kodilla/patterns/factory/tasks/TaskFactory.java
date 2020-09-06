package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final TaskType SHOPPINGTASK = TaskType.SHOPPING;
    public static final TaskType PAINTINGTASK = TaskType.PAINTING;
    public static final TaskType DRIVINGTASK = TaskType.DRIVING;

    public final Task makeTask(final TaskType taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping for weekend", "bread", 3.5);
            case PAINTING:
                return new PaintingTask("Paint car", "blue", "Audi Q7");
            case DRIVING:
                return new DrivingTask("Go for weekend trip", "Lublin", "car");
            default:
                return null;
        }
    }
}
