package com.kodilla.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class VegetablesDecorator extends AbstractPizzaOrderDecorator {
    public VegetablesDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with vegetables";
    }
}
