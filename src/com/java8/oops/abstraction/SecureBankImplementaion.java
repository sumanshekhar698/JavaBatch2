package com.java8.oops.abstraction;

public class SecureBankImplementaion extends SecuredBank{


    public SecureBankImplementaion(String bankName, String branch, String ifscCode) {
        super(bankName, branch, ifscCode);
    }

    @Override
    long checkBalance(long acNo) {
        return 10000000;
    }

    @Override
    int amountOfLoanTaken(long acNo) {
        return 20000;
    }
}
