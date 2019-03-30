package com.pairgood.kata;

public class FizzBuzz{

    public String calculate(Integer value) {

        if(value % 3 == 0){
            return "Fizz";
        }

        if(value % 5 == 0){
            return "Buzz";
        }

        return value.toString();
    }
}
