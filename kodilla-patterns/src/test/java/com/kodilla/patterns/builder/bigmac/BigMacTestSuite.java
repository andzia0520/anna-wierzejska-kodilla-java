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
                .ingredient(Ingredients.ONION)
                .ingredient(Ingredients.BACON)
                .sauce(STANDARD)
                .ingredient(Ingredients.SHRIMPS)
                .ingredient(Ingredients.RED_HOT_CHILI_PEPPERS)
                .build();

        //When
        Bun whichBun = bigMac.getBun();
        Sauce whichSauce = bigMac.getSauce();
        int howManyBurgers = bigMac.getBurgers();
        int howManyIngredients = bigMac.getIngredients().size();
        boolean isIngredientInBigMac = bigMac.getIngredients().contains(Ingredients.RED_HOT_CHILI_PEPPERS);
        boolean isInBigMac = bigMac.getIngredients().contains(Ingredients.SALAD);

        //Then
        Assert.assertEquals(WITH_SESAME, whichBun);
        Assert.assertEquals(STANDARD, whichSauce);
        Assert.assertEquals(4,howManyBurgers);
        Assert.assertEquals(howManyIngredients, howManyIngredients);
        Assert.assertTrue(isIngredientInBigMac);
        Assert.assertFalse(isInBigMac);
    }
}
