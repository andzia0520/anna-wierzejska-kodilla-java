package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        // Given
        World world = new World();

        //When
        world.addContinent(new Continent("Europe",(new Country("Poland", "38000000"))));
        world.addContinent(new Continent("Europe",(new Country("Hungary", "30000000"))));
        world.addContinent(new Continent("NorthAmerica",(new Country("USA", "120 000 000"))));
        world.addContinent(new Continent("NorthAmerica",(new Country("Canada", "100 000 000"))));
        world.addContinent(new Continent("SouthAmerica",(new Country("Brazil", "90 000 000"))));
        world.addContinent(new Continent("SouthAmerica",(new Country("Argentina", "80 000 000"))));

        //Then
        Assert.assertEquals("458 000 000", world.getPeopleQuantity());
    }
}
