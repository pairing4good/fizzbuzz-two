package com.pairgood.kata;

public class FizzBuzz{

    public String calculate(Integer value) {
        if(value % 3 == 0){
            return "Fizz";
        }
        return value.toString();
    }
}
