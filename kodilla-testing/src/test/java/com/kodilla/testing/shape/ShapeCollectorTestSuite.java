package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    Circle circle = new Circle(3);
    Square square = new Square(4);
    Triangle triangle = new Triangle(3, 2.5);

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
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
        Assert.assertEquals(square, shapeCollector.getFigure(1));
        Assert.assertEquals(triangle, shapeCollector.getFigure(2));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //When
        shapeCollector.removeFigure(square);

        //Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
        Assert.assertEquals(triangle, shapeCollector.getFigure(1));
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Shape shape = shapeCollector.getFigure(0);

        //Then
        Assert.assertNull(shape);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //When
        shapeCollector.showFigures();

        //then test pass
    }


}
