package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(10.7, 3.1);
        double subResult = calculator.sub(23.3, 14.6);
        double mulResult = calculator.mul(3.3, 4.7);
        double divResult = calculator.div(20.6, 4.1);
        //Then
        Assert.assertEquals(13.8, addResult, 0.001);
        Assert.assertEquals(8.7, subResult, 0.001);
        Assert.assertEquals(15.51, mulResult, 0.001);
        Assert.assertEquals(5.02, divResult, 0.01);
    }
}
