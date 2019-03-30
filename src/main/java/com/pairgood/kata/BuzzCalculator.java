package com.pairgood.kata;

public class BuzzCalculator {

    public String calculate(Integer value, String out) {
        if(value % 5 == 0){
            out += "Buzz";
        }
        return out;
    }
}
