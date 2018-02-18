package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void TaskFactoryTest() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task morningShopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        Task summerPainting = taskFactory.makeTask(TaskFactory.PAINTING);
        Task weekendTrip = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Morning shopping", morningShopping.getTaskName());
        Assert.assertEquals("Shopping in progress", morningShopping.executeTask());
        Assert.assertTrue(morningShopping.isTaskExecuted());

        Assert.assertEquals("Summer painting", summerPainting.getTaskName());
        Assert.assertEquals("Painting in progress", summerPainting.executeTask());
        Assert.assertFalse(summerPainting.isTaskExecuted());

        Assert.assertEquals("Long weekend trip", weekendTrip.getTaskName());
        Assert.assertEquals("Driving in progress", weekendTrip.executeTask());
        Assert.assertFalse(weekendTrip.isTaskExecuted());
    }
}
