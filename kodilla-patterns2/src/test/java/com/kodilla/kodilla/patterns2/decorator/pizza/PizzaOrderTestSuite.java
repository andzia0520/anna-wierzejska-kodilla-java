package com.kodilla.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
     public void testBasicPizzaGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        BigDecimal price = theOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(15), price);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        String ingredients = theOrder.getDescription();

        //Then
        assertEquals("You ordered margarita pizza: thin bottom, tomato sauce and cheese", ingredients);
    }

    @Test
    public void testBasicPizzaLargeWithExtraCheeseWithMeatAndDoubleVegetablesGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SizeDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MeatDecorator(theOrder);
        theOrder = new VegetablesDecorator(theOrder);
        theOrder = new VegetablesDecorator(theOrder);

        //When
        BigDecimal price = theOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(55), price);
    }

    @Test
    public void testBasicPizzaLargeWithExtraCheeseWithMeatAndDoubleVegetablesGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SizeDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MeatDecorator(theOrder);
        theOrder = new VegetablesDecorator(theOrder);
        theOrder = new VegetablesDecorator(theOrder);

        //When
        String ingredients = theOrder.getDescription();

        //Then
        assertEquals("You ordered margarita pizza: thin bottom, tomato sauce and cheese, size: large, with extra cheese," +
                " with ham and pork sausage, with vegetables, with vegetables", ingredients);
    }

}
