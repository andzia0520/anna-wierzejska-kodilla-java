package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        //triangle base length
        this.h = h;
        // triangle height
    }

    public String getShapeName() {
        return "triangle";
    }

    public double getField() {
        return (a * h) / 2;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }
}
