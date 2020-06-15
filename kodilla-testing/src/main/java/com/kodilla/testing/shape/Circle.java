package com.kodilla.testing.shape;

public class Circle implements Shape {

    String shapeName;
    double field;

    public Circle(String shapeName, double field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return "circle";
    }

    public double getField(double radius) {
        return Math.PI * radius * radius;
    }
}
