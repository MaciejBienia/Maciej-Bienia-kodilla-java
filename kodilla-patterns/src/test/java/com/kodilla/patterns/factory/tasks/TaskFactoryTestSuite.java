package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;

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
        System.out.println(     ((ShoppingTask)morningShopping).getQuantity()    );
        Assert.assertEquals("Shopping in progress", morningShopping.executeTask());

        if(LocalTime.now().isAfter(LocalTime.of(10,00))) {
            Assert.assertTrue(morningShopping.isTaskExecuted());
        } else {
            Assert.assertTrue(morningShopping.isTaskExecuted());
        }

        Assert.assertEquals("Summer painting", summerPainting.getTaskName());
        Assert.assertEquals("Painting in progress", summerPainting.executeTask());

        if (LocalDate.now().isBefore(LocalDate.of(2108, 7, 1))) {
            Assert.assertFalse(summerPainting.isTaskExecuted());
        } else {
            Assert.assertTrue(summerPainting.isTaskExecuted());
        }

        Assert.assertEquals("Long weekend trip", weekendTrip.getTaskName());
        Assert.assertEquals("Driving in progress", weekendTrip.executeTask());
        if (LocalDate.now().isBefore(LocalDate.of(2108, 5, 1))) {
            Assert.assertFalse(weekendTrip.isTaskExecuted());
        } else {
            Assert.assertTrue(weekendTrip.isTaskExecuted());
        }
    }
}
