package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Learning", "learn Spring and Hibernate");
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When & Then
        Assert.assertEquals(1, taskListDao.findByListName(listName).size());

        //CleanUp
        int id = taskList.getId();
        taskListDao.deleteById(id);
    }
}
