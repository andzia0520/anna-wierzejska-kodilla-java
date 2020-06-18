package com.kodilla.testing.shape;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        Circle circle = new Circle(2.3);
        Square square = new Square(2);
        Triangle triangle = new Triangle(2, 3);

        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);
    }

    public void removeFigure(Shape shape) {
        Circle circle = new Circle(2.3);
        Square square = new Square(2);
        Triangle triangle = new Triangle(2, 3);

        shapes.remove(circle);
        shapes.remove(square);
        shapes.remove(triangle);
    }

    public void getFigure(int n) {

        shapes.get(0);
        shapes.get(1);
        shapes.get(2);
    }
    public void showFigures() {

    }

}
