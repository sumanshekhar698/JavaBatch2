package com.java8.oops.abstraction;

public class Banking {

    public static void main(String[] args) {
        Bank boi_rnc = new Bank("BOI", "ranchi", "RNC002");
        System.out.println(boi_rnc.amountOfLoanTaken(76868));
    }
}
