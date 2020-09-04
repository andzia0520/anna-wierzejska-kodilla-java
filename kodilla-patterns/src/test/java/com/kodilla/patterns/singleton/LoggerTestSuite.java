package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLog() {
        //Given
        Logger.getInstance().log("Hello world");
        Logger.getInstance().log("I'm already learning chapter 15");

        //When
        String result = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("I'm already learning chapter 15", result);
    }
}
