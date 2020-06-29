package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        // Given
        Continent europe = new Continent();
        europe.addCountry(new Country("Poland", new BigDecimal("38000000")));
        europe.addCountry(new Country("Hungary", new BigDecimal("30000000")));

        Continent northAmerica = new Continent();
        northAmerica.addCountry(new Country("USA", new BigDecimal("120000000")));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("100000000")));

        Continent southAmerica = new Continent();
        southAmerica.addCountry(new Country("Brazil", new BigDecimal("90000000")));
        southAmerica.addCountry(new Country("Argentina", new BigDecimal("80000000")));

        World world = new World();

        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);


        //Then
        Assert.assertEquals(new BigDecimal("458000000"), world.getPeopleQuantity());
    }
}
