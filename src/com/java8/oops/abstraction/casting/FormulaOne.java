package com.java8.oops.abstraction.casting;

public class FormulaOne extends SuperCar {

    String color;

    @Override
    long circuitsRun() {
        return System.currentTimeMillis() / 10000000;
    }

    @Override
    long getTopSpeed() {
        return System.currentTimeMillis() / 1000000;
    }


    String colorOfF1() {//specialized method
        return this.color;
    }
}
