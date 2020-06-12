package com.kodilla.testing.calculator;

public class Calculator {

    private final int a;
    private final int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addAToB() {
        return a + b;
    }

    public int subtractBFromA() {
        return a - b;
    }
}
