package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String nameOfCountry;
    private final BigDecimal peopleQty;

    public Country(final String nameOfCountry, final BigDecimal peopleQty) {
        this.nameOfCountry = nameOfCountry;
        this.peopleQty = peopleQty;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQty;
    }
}
