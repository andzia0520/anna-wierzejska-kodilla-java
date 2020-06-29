package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int numbers[] = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200};

        //When
        double actualAverage = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(150, actualAverage, 0.01);
    }
}
