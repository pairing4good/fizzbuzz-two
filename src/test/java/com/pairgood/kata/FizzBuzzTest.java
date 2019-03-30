package com.pairgood.kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void calculate_WhenPassedOneThenReturnOne(){
        //Act
        String actual = fizzBuzz.calculate(1);

        //Assert
        assertEquals("1", actual);
    }
}
