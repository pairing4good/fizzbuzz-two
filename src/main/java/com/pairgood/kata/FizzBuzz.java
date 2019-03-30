package com.pairgood.kata;

public class FizzBuzz{

    public String calculate(Integer value) {

        String out = "";

        if(value % 3 == 0){
            out += "Fizz";
        }

        if(value % 5 == 0){
            out += "Buzz";
        }

        if(out.isEmpty()){
            out = value.toString();
        }

        return out;
    }
}
