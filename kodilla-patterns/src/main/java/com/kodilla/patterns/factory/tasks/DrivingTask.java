package com.kodilla.patterns.factory.tasks;

import java.time.LocalDate;

public class DrivingTask implements Task{
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return "Driving in progress";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return (LocalDate.now().isAfter(LocalDate.of(2018, 5, 1)));
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
}
