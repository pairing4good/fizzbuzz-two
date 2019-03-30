package com.pairgood.kata;

import org.junit.Assert;
import org.junit.Test;

public class FizzCalculatorTest {

    @Test
    public void calculate_WhenValueIsThreeReturnFizz(){
        FizzCalculator fizzCalculator = new FizzCalculator();

        String actual = fizzCalculator.calculate(3, "");

        Assert.assertEquals("Fizz", actual);
    }

    @Test
    public void calculate_WhenGivenAnIntialValueBuzzIsAppended(){
        FizzCalculator fizzCalculator = new FizzCalculator();

        String actual = fizzCalculator.calculate(3, "test");

        Assert.assertEquals("test" + "Fizz", actual);
    }
}
