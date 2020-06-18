package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(Circle);
        shapeCollector.addFigure(Square);
        shapeCollector.addFigure(Triangle);

        //Then
        Assert.assertEquals(3, shapes.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.removeFigure(Circle);
        shapeCollector.removeFigure(Square);
        shapeCollector.removeFigure(Triangle);

        //Then
        Assert.assertEquals(3, shapes.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When

    }


}
