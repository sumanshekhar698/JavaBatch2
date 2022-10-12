package com.java8.oops.abstraction;

public abstract class SecuredBank  {

     String bankName;
    String branch;
    String ifscCode;


    public SecuredBank(String bankName, String branch, String ifscCode) {
        this.bankName = bankName;
        this.branch = branch;
        this.ifscCode = ifscCode;
    }

    abstract long checkBalance(long acNo);//abstract method

    String accountDetails(long acNo) {//concrete method
        return "You have an account in " + toString();
    }

    abstract int amountOfLoanTaken(long acNo);

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", branch='" + branch + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                '}';
    }
}
