package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacNew() {
        //Given
        BigMac bigmac = new BigMac.BigMacBuilder()
                .bun("with sesame")
                .burgers(4)
                .ingredient("onion")
                .ingredient("bacon")
                .sauce("standard")
                .ingredient("shrimps")
                .ingredient("cucumber")
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
