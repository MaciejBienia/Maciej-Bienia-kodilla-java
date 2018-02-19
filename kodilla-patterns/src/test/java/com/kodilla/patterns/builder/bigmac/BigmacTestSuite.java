package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void BigmacBuilderTest() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("With sezam")
                .burgers(2)
                .sauce("Thousand Island")
                .ingredient("Salad")
                .ingredient("Cheese")
                .ingredient("Mushrooms")
                .ingredient("Bacon")
                .ingredient("Onion")
                .ingredient("Cucumber")
                .build();
        System.out.println(bigmac);
        //When
        String rollType = bigmac.getRoll();
        int burgersQuantity = bigmac.getBurgers();
        String sauceType = bigmac.getSauce();
        int ingredientsQuantity = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals("With sezam", rollType);
        Assert.assertEquals(2, burgersQuantity);
        Assert.assertEquals("Thousand Island", sauceType);
        Assert.assertEquals(6, ingredientsQuantity);
    }
}
