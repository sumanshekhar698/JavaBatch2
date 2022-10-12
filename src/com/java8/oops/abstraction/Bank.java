package com.java8.oops.abstraction;

public class Bank extends Object {

    final String bankName;
    String branch;
    String ifscCode;


    public Bank(String bankName, String branch, String ifscCode) {
        this.bankName = bankName;
        this.branch = branch;
        this.ifscCode = ifscCode;
    }

    long checkBalance(long acNo) {
        return 10000000;
    }


    String accountDetails(long acNo) {
        return "You have an account in " + toString();
    }

    int amountOfLoanTaken(long acNo) {
        return 20000;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", branch='" + branch + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                '}';
    }
}
