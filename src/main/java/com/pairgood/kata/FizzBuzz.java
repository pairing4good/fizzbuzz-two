package com.pairgood.kata;

public class FizzBuzz{

    private BuzzCalculator buzz;
    private FizzCalculator fizz;

    public FizzBuzz(BuzzCalculator buzz, FizzCalculator fizz){
        this.buzz = buzz;
        this.fizz = fizz;
    }

    public String calculate(Integer value) {

        String out = "";

        out = fizz.calculate(value, out);
        out = buzz.calculate(value, out);

        if(out.isEmpty()){
            out = value.toString();
        }

        return out;
    }
}
