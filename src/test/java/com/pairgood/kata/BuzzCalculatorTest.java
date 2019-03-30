package com.pairgood.kata;

import org.junit.Assert;
import org.junit.Test;

public class BuzzCalculatorTest {

    @Test
    public void calculate_WhenValueIsFiveReturnBuzz(){
        BuzzCalculator buzzCalculator = new BuzzCalculator();

        String actual = buzzCalculator.calculate(5, "");

        Assert.assertEquals("Buzz", actual);
    }

    @Test
    public void calculate_WhenGivenAnIntialValueBuzzIsAppended(){
        BuzzCalculator buzzCalculator = new BuzzCalculator();

        String actual = buzzCalculator.calculate(5, "Fizz");

        Assert.assertEquals("Fizz" + "Buzz", actual);
    }
}
