package com.kodilla.stream.world;
import java.math.BigDecimal;
import org.junit.*;
import org.junit.Assert;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europe = new Continent();
        Continent africa = new Continent();
        Continent asia = new Continent();
        Continent northAmerica = new Continent();
        Continent southAmerica = new Continent();

        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);

        europe.addCountry(new Country("Poland", new BigDecimal("37955226")));
        europe.addCountry(new Country("Germany", new BigDecimal("82675465")));
        europe.addCountry(new Country("France", new BigDecimal("66980323")));
        africa.addCountry(new Country("Algieria", new BigDecimal("33778909")));
        africa.addCountry(new Country("Ethiopia", new BigDecimal("78254637")));
        africa.addCountry(new Country("Morocco", new BigDecimal("33801923")));
        asia.addCountry(new Country("China", new BigDecimal("1330044605")));
        asia.addCountry(new Country("India", new BigDecimal("1147996000")));
        asia.addCountry(new Country("Japan", new BigDecimal("127078679")));
        northAmerica.addCountry(new Country("USA", new BigDecimal("308878120")));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("33989040")));
        northAmerica.addCountry(new Country("Mexico", new BigDecimal("107563903")));
        southAmerica.addCountry(new Country("Argentina", new BigDecimal("40913584")));
        southAmerica.addCountry(new Country("Colombia", new BigDecimal("43677372")));
        southAmerica.addCountry(new Country("Peru", new BigDecimal("29546963")));
        //when
        BigDecimal calculatedWorldPeopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedWorldPeopleQuantity = new BigDecimal("3503134749");
        //then
        Assert.assertEquals(expectedWorldPeopleQuantity, calculatedWorldPeopleQuantity);
    }
}