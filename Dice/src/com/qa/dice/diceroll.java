package com.qa.dice;

//import java.util.Random;
//
//public class diceroll {
//
//    public static void main(String[] args) {
//        System.out.println(rollTwoDTwenty());
//    }
//
//    public static int rollTwoDTwenty() {
//        int total = 0;
//        total += rollDTwenty();
//        total += rollDTwenty();
//        return total;
//    }
//
//    public static int rollDTwenty() {
//        return new Random().nextInt(21);
//    }

//}

public class diceroll {

    public static void method1() {
        for(int i = 0; i <= 21; i++) {
            int number = 0;
            number += i;
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        method1();
    }

}