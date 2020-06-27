package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        IntStream.range(1, 20).forEach(i -> System.out.print(i + " "));

        double numbersAverage = IntStream.range(0, numbers.length)
                .average()
                .getAsDouble();

        return numbersAverage;
    }
}

