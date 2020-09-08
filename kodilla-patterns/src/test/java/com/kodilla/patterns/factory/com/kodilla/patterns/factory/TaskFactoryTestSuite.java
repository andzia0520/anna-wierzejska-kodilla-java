package com.kodilla.patterns.factory.com.kodilla.patterns.factory;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import com.kodilla.patterns.factory.tasks.TaskType;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.makeTask(TaskType.SHOPPING);

        //Then
        assert shoppingTask != null;
        Assert.assertFalse(shoppingTask.isTaskExecuted());
        Assert.assertEquals("Shopping for weekend", shoppingTask.getTaskName());

        //When
        shoppingTask.executeTask();

        //Then
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.makeTask(TaskType.PAINTING);

        //Then
        assert paintingTask != null;
        Assert.assertFalse(paintingTask.isTaskExecuted());
        Assert.assertEquals("Paint car", paintingTask.getTaskName());

        //When
        paintingTask.executeTask();

        //Then
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.makeTask(TaskType.DRIVING);

        //Then
        assert drivingTask != null;
        Assert.assertFalse(drivingTask.isTaskExecuted());
        Assert.assertEquals("Go for weekend trip", drivingTask.getTaskName());

        //When
        drivingTask.executeTask();

        //Then
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}

