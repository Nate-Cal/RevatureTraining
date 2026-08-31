package com.revature;

public class Primitives {
    public static void main(String[] args) {

        // Primitive Types
        byte myByte = 0;
        short myShort = 10;
        int myInt = 100;
        long myLong = 1000;
        float myFloat = 1000.50f;
        double myDouble = 1000.5001d;

        char myChar = 'a';

        boolean myBoolean = true;

        // CASTING
        int impreciseNumber = 99;
        float preciseNumber = (float) impreciseNumber;
        System.out.println(preciseNumber);

        preciseNumber = 99.999f;
        System.out.println(preciseNumber);

        int backToImpreciseNumber = (int) preciseNumber;
        System.out.println(backToImpreciseNumber);


    }
}
