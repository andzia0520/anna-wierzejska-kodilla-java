package com.kodilla.patterns.factory.com.kodilla.patterns.factory;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);

        //Then
        assert shoppingTask != null;
        Assert.assertEquals("Buy bread", shoppingTask.executeTask());
        Assert.assertEquals("Shopping for weekend", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);

        //Then
        assert paintingTask != null;
        Assert.assertEquals("We are painting blue Audi Q7", paintingTask.executeTask());
        Assert.assertEquals("Paint car", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);

        //Then
        assert drivingTask != null;
        Assert.assertEquals("We are going to Lublin by car", drivingTask.executeTask());
        Assert.assertEquals("Go for weekend trip", drivingTask.getTaskName());
        Assert.assertFalse(drivingTask.isTaskExecuted());
    }
}

