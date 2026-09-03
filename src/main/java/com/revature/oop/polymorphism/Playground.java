package com.revature.oop.polymorphism;

public class Playground {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        // Overriding : Compile-Time Polymorphism
        parent.parentMethod();
        child.parentMethod();

        System.out.println();

        // Overloading : Run-Time Polymorphism
        child.childMethod(10);
        child.childMethod("ten");

    }
}
