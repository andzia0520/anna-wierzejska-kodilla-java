package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateTaskCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void updateTasksQueue(Student student) {
        System.out.println(mentorName + ": new task from Student: " + student.getStudentName() +
                " Total tasks qty: " + student.getTasks().size());
        updateTaskCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateTaskCount() {
        return updateTaskCount;
    }
}
