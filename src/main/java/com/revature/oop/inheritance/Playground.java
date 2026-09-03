package com.revature.oop.inheritance;

public class Playground {
    public static void main(String[] args) {
        Child child = new Child(12, "Billy", "Fifth grade");
        child.greetSomeone();
        child.sayCatchPhrase();

        System.out.println();

        ChildTwo childTwo = new ChildTwo(21, "Sally", "Graduated");
        childTwo.greetSomeone();
        childTwo.sayCatchPhrase();
        childTwo.sing();


        Parent billy = new Child(12, "Billy", "Fifth grade");
        billy.greetSomeone();
        billy.sayCatchPhrase();

        System.out.println();

        Parent sally = new ChildTwo(21, "Sally", "Graduated");
        sally.greetSomeone();
        sally.sayCatchPhrase();
        // Compilation Error, because it is a parent object, it does not have access to resources in ChildTwo
//        sally.sing();

    }
}
