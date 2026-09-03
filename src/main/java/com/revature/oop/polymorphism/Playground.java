package com.revature.oop.polymorphism;

public class Playground {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        // Overriding : Run-Time Polymorphism
        parent.parentMethod();
        child.parentMethod();

        System.out.println();

        // Overloading : Compile-Time Polymorphism
        child.childMethod(10);
        child.childMethod("ten");

    }
}
