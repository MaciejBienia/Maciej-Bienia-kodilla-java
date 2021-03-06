package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = context.getBean(Board.class);
        List<String> toDoList = board.getToDoList().getTasks();
        List<String> inProgressList = board.getInProgressList().getTasks();
        List<String> doneList = board.getDoneList().getTasks();
        toDoList.add("Shopping");
        inProgressList.add("Room painting");
        doneList.add("Car wash");
        //Then
        Assert.assertEquals("Shopping", toDoList.get(0));
        Assert.assertEquals("Room painting", inProgressList.get(0));
        Assert.assertEquals("Car wash", doneList.get(0));
    }
}
