package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentsTestSuite {
    @Test
    public void testUpdateTasksQueue() {
        //Given
        Student annaW = new Student("Anna W.");
        Student borysL = new Student("Borys L.");
        Student arturZ = new Student("ArturZ.");
        Mentor filip = new Mentor("Filip");
        Mentor piotr = new Mentor("Piotr");
        annaW.registerObserver(filip);
        borysL.registerObserver(filip);
        arturZ.registerObserver(piotr);

        //When
        annaW.addTask("modul 1");
        arturZ.addTask("while loop");
        borysL.addTask("REST API");
        annaW.addTask("modul 24");
        borysL.addTask("Hibernate");

        //Then
        assertEquals(4, filip.getUpdateTaskCount());
        assertEquals(1, piotr.getUpdateTaskCount());
    }
}
