package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.patterns.builder.bigmac.Bun.WITH_SESAME;
import static com.kodilla.patterns.builder.bigmac.Sauce.STANDARD;

public class BigMacTestSuite {
    @Test
    public void testBigMacNew() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun(WITH_SESAME)
                .burgers(4)
                .ingredient(Ingredient.ONION)
                .ingredient(Ingredient.BACON)
                .sauce(STANDARD)
                .ingredient(Ingredient.SHRIMPS)
                .ingredient(Ingredient.RED_HOT_CHILI_PEPPERS)
                .build();

        //When
        Bun whichBun = bigMac.getBun();
        Sauce whichSauce = bigMac.getSauce();
        int howManyBurgers = bigMac.getBurgers();
        int howManyIngredients = bigMac.getIngredients().size();
        boolean hasRedHotChiliPeppers = bigMac.getIngredients().contains(Ingredient.RED_HOT_CHILI_PEPPERS);
        boolean hasSalad = bigMac.getIngredients().contains(Ingredient.SALAD);

        //Then
        Assert.assertEquals(WITH_SESAME, whichBun);
        Assert.assertEquals(STANDARD, whichSauce);
        Assert.assertEquals(4, howManyBurgers);
        Assert.assertEquals(howManyIngredients, howManyIngredients);
        Assert.assertTrue(hasRedHotChiliPeppers);
        Assert.assertFalse(hasSalad);
    }
}
