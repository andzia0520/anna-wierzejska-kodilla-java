package com.kodilla.spring.portfolio;

public class Board {
    private final TaskList getToDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public TaskList getGetToDoList() {
        return getToDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.getToDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;


    }
}
