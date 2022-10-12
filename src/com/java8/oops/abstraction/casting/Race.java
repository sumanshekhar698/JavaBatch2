package com.java8.oops.abstraction.casting;

public class Race {

    public static void main(String[] args) {
        SuperCar f1 = new FormulaOne();//TypeCasing UPCASTING
//        f1.color="RED";
        f1.circuitsRun();
        f1.getTopSpeed();
//        f1.colorOfF1();
//        System.out.println(f1.color);
        System.out.println(f1.manufacturer);


//        SuperCar f1 = new FormulaOne();



    }
}
