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

    @Test
    public void calculate_WhenPassedTwoThenReturnTwo(){
        //Act
        String actual = fizzBuzz.calculate(2);

        //Assert
        assertEquals("2", actual);
    }

    @Test
    public void calculate_WhenPassedThreeThenReturnFizz(){
        //Act
        String actual = fizzBuzz.calculate(3);

        //Assert
        assertEquals("Fizz", actual);
    }

    @Test
    public void calculate_WhenPassedFiveThenReturnBuzz(){
        //Act
        String actual = fizzBuzz.calculate(5);

        //Assert
        assertEquals("Buzz", actual);
    }

    @Test
    public void calculate_WhenPassedFifteenThenReturnFizzBuzz(){
        //Act
        String actual = fizzBuzz.calculate(15);

        //Assert
        assertEquals("FizzBuzz", actual);
    }
}
