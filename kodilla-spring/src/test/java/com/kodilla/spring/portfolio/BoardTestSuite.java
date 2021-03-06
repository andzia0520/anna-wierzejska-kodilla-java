package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BoardTestSuite {
    //Given
    ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
    Board board = context.getBean(Board.class);

    @Test
    public void testTaskAdd() {
        //When
        board.getGetToDoList().tasks.add("chapter 15");
        board.getInProgressList().tasks.add("chapter 14");
        board.getInProgressList().tasks.add("chapter 13");
        board.getDoneList().tasks.add("chapter 12");

        //Then
        Assert.assertEquals(1, board.getGetToDoList().tasks.size());
        Assert.assertEquals(2, board.getInProgressList().tasks.size());
        Assert.assertEquals(1, board.getDoneList().tasks.size());
    }

    @Test
    public void testGetToDoList() {
        //When
        board.getGetToDoList().tasks.add("chapter 15");
        board.getInProgressList().tasks.add("chapter 14");
        board.getInProgressList().tasks.add("chapter 13");
        board.getDoneList().tasks.add("chapter 12");

        //Then
        Assert.assertEquals("chapter 15", board.getGetToDoList().getTasks().get(0));
    }

    @Test
    public void testGetInProgressList() {
        //When
        board.getGetToDoList().tasks.add("chapter 15");
        board.getInProgressList().tasks.add("chapter 14");
        board.getInProgressList().tasks.add("chapter 13");
        board.getDoneList().tasks.add("chapter 12");

        //Then
        Assert.assertEquals("chapter 14", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("chapter 13", board.getInProgressList().getTasks().get(1));
    }

    @Test
    public void testGetDoneList() {
        //When
        board.getGetToDoList().tasks.add("chapter 15");
        board.getInProgressList().tasks.add("chapter 14");
        board.getInProgressList().tasks.add("chapter 13");
        board.getDoneList().tasks.add("chapter 12");

        //Then
        Assert.assertEquals("chapter 12", board.getDoneList().getTasks().get(0));
    }
}
