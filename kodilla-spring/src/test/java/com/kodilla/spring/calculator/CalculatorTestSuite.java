package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //Then
        Assert.assertEquals(7.0, calculator.add(4, 3), 0.1);
        Assert.assertEquals(1.0, calculator.sub(4, 3), 0.1);
        Assert.assertEquals(12.0, calculator.mul(4, 3), 0.1);
        Assert.assertEquals(1.33, calculator.div(4, 3), 0.1);
    }
}
