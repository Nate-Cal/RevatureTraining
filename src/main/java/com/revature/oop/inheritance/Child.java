package com.revature.oop.inheritance;

public class Child extends Parent {

    public String grade;

    public Child(int age, String name, String grade) {
        super(age, name);
        this.grade = grade;
    }

    @Override
    public void sayCatchPhrase() {
        System.out.println("Gotta legally distinct collect them all!");
    }
}
