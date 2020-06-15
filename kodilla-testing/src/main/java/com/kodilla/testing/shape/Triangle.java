package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String ShapeName;
    double field;

    public Triangle(String shapeName, double field) {
        ShapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return "triangle";
    }

    public double getField(double a, double h) {
        return (a * h) / 2;
    }
}
