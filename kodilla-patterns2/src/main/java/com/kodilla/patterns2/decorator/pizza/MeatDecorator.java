package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MeatDecorator extends AbstractPizzaOrderDecorator {
    public MeatDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with ham and pork sausage";
    }
}
