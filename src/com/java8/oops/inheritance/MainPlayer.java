package com.java8.oops.inheritance;

public class MainPlayer {

    public static void main(String[] args) {
        short goals = 200;
//		PlayerOfFIFA_A p1 = new PlayerOfFIFA_A("Ronaldo ", 7, 5.8f, "Striker", goals);
//
//		System.out.println(p1);

        PlayerOfFIFA_B p2 = new PlayerOfFIFA_B("Messi", 5, 56, 7, "Argentina", "Striker", goals);
        System.out.println(p2);


//        UPCASTING is implicit in nature
        Player p3 = new PlayerOfFIFA_B("Messi", 5, 56, 7, "Argentina", "Striker", goals);
        System.out.println(p3);

//		PlayerOfFIFA_B p4 = new Player("Sunil",108,55,6,"IND");


//        DOWNCASTING is explicit in nature
        PlayerOfFIFA_B p5 = (PlayerOfFIFA_B) p3;//DOWNCASTING
        p5.getGoals();
        p5.showPlayerNumber();


    }

}
