package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        double y = 1.5;
        double x = 1;

        try {
            secondChallenge.probablyIWillThrowException(x, y);

        } catch (Exception e) {
            System.out.println("Attention, you've put arguments from exception.");

        } finally {
            System.out.println("Is working.");
        }
    }
}

