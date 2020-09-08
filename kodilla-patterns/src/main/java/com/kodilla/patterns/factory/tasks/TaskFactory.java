package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

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
