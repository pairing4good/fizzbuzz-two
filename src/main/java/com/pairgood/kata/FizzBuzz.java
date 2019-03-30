package com.pairgood.kata;

public class FizzBuzz{

    public String calculate(Integer value) {

        String out = value.toString();

        if(value % 3 == 0){
            out = "Fizz";
        }

        if(value % 5 == 0){
            out = "Buzz";
        }

        if((value % 3 == 0) && (value % 5 == 0)){
            out = "FizzBuzz";
        }

        return out;
    }
}
