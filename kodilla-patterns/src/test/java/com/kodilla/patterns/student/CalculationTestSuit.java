package com.kodilla.patterns.student;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculationTestSuit {

    @Test
    public void testCalculateBestAverage() {
        //Given
        Calculations calculation = new Calculations();

        Student adam = new Student("adam", "padam");
        Student marek = new Student("marek", "zegarek");
        Student arek = new Student("arek", "katarek");
        Student lala = new Student("lala", "kala");
        Student basia = new Student("basia", "wasia");

        List<Integer> adamMGrades = new ArrayList<>();
        adamMGrades.add(2);
        adamMGrades.add(3);
        adamMGrades.add(4);

        List<Integer> adamEGrades = new ArrayList<>();
        adamEGrades.add(2);
        adamMGrades.add(3);

        List<Integer> adamPhGrades = new ArrayList<>();
        adamPhGrades.add(6);

        Grades adamGrades = new Grades(adamEGrades,adamEGrades,adamPhGrades);


        List<Integer> marekMGrades = new ArrayList<>();
        marekMGrades.add(2);
        marekMGrades.add(3);
        marekMGrades.add(4);

        List<Integer> marekEGrades = new ArrayList<>();
        marekEGrades.add(4);
        marekEGrades.add(3);

        List<Integer> marekPhGrades = new ArrayList<>();
        marekPhGrades.add(4);
        marekPhGrades.add(4);

        Grades marekGrades = new Grades(marekMGrades, marekEGrades, marekPhGrades);

        List<Integer> arekMGrades = new ArrayList<>();
        arekMGrades.add(3);
        arekMGrades.add(4);

        List<Integer> arekEGrades = new ArrayList<>();
        arekEGrades.add(4);
        arekEGrades.add(3);

        List<Integer> arekPhGrades = new ArrayList<>();
        arekPhGrades.add(4);
        arekPhGrades.add(4);

        Grades arekGrades = new Grades(arekMGrades, arekEGrades, arekPhGrades);

/*        List<Double> adamGrades = new ArrayList<>();
        adamGrades.add(2.5);
        adamGrades.add(2.5);

        List<Double> marekGrades = new ArrayList<>();
        marekGrades.add(2.5);
        marekGrades.add(2.0);
        marekGrades.add(3.5);

        List<Double> arekGrades = new ArrayList<>();
        arekGrades.add(2.0);
        arekGrades.add(2.0);
        arekGrades.add(5.5);

        List<Double> lalaGrades = new ArrayList<>();
        lalaGrades.add(2.0);
        lalaGrades.add(2.0);
        lalaGrades.add(5.0);
        lalaGrades.add(6.0);
        lalaGrades.add(4.5);
        lalaGrades.add(5.0);

        List<Double> basiaGrades = new ArrayList<>();
        basiaGrades.add(2.5);
        basiaGrades.add(2.0);
        basiaGrades.add(5.0);
        basiaGrades.add(6.0);
        basiaGrades.add(4.0);

        Map<Student, List<Double>> notes = new HashMap<>();
        notes.put(adam, adamGrades);
        notes.put(marek, marekGrades);
        notes.put(arek, arekGrades);
        notes.put(lala, lalaGrades);
        notes.put(basia, basiaGrades);


Map<Student, Double> grades = new HashMap<>();
        grades.put(adam, 3.0);
        grades.put(marek, 4.5);
        grades.put(arek, 5.0);
        grades.put(lala, 6.0);
        grades.put(basia, 5.5);


        //When

        Student bestStudent = calculation.showStudentWithBestAverage(notes);*/


        //Then
/*Assert.assertEquals(1, bestStudent.size());
        Assert.assertTrue(bestStudent.contains(lala));*/

/*
System.out.println(grades.entrySet().stream()
                .filter(entry -> entry.getValue().equals(Collections.max(grades.values()))));






   for (Map.Entry<Student, List<Double>> entry : notes.entrySet()) {
            System.out.println(entry.getValue().stream()
                    .collect(Collectors.averagingDouble(Double::doubleValue)));
        }
*/

    }
}



