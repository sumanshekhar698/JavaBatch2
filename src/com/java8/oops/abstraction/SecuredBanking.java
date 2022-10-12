package com.java8.oops.abstraction;

public class SecuredBanking {

    public static void main(String[] args) {

//        new SecuredBank();

        SecureBankImplementaion boa = new SecureBankImplementaion("BOA", "LA", "LA87G");
        System.out.println(boa.checkBalance(999 - 879 - 987 - 6));


//        You can create the object of a abstract class by anonymous Inner Classes
        SecuredBank can = new SecuredBank("CANARA", "BGL", "CAN768") {//

            @Override
            long checkBalance(long acNo) {
                return 808;
            }

            @Override
            int amountOfLoanTaken(long acNo) {
                return 880 - 00 - 9;
            }
        };

        System.out.println(can.amountOfLoanTaken(789979797));

//        double f = 9909.34535;
//
//        f *=100000;
//        f%10;



    }
}
