package com.revature.oop.inheritance;

import java.util.UUID;

public abstract class Parent {

    public UUID socialSecurityNumber;
    public int age;
    public String name;

    public Parent(int age, String name) {
        this.socialSecurityNumber = UUID.randomUUID();
        this.age = age;
        this.name = name;
    }

    public void greetSomeone() {
        System.out.println("Hello! I am " + this.name + " and I am " + this.age + " years old.");
    }

    public abstract void sayCatchPhrase();


}
