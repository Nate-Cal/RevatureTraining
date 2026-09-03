package com.revature.oop.polymorphism;

public class Child extends Parent {

    @Override
    public void parentMethod() {
        System.out.println("This is the new implementation in the Child class");
    }

    public void childMethod(int num) {
        System.out.println("You entered a number into the childMethod");
    }

    public void childMethod(String word) {
        System.out.println("You entered a String into the childMethod");
    }

}
