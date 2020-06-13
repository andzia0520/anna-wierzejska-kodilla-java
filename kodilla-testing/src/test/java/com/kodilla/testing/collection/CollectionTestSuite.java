package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;

import static com.kodilla.testing.collection.OddNumbersExterminator.*;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        ArrayList<Integer> evenNumbers = exterminate(emptyList);
        System.out.println("Testing" + evenNumbers);
        //Then
        Assert.assertEquals(emptyList, evenNumbers);
    }

    @Test
    public void testOddNumbersExterminatorNormalList () {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> evenNumbersExpected = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        //When
        ArrayList<Integer> evenNumbers = exterminate(numbers);
        System.out.println("Testing" + evenNumbers);
        //Then
        Assert.assertEquals(evenNumbersExpected, evenNumbers);
    }
}
