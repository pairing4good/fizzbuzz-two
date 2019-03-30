package com.pairgood.kata;

public class FizzCalculator {

    public String calculate(Integer value, String out) {
        if(value % 3 == 0){
            out += "Fizz";
        }
        return out;
    }
}
