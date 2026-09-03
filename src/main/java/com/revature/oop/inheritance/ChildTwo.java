package com.revature.oop.inheritance;

public class ChildTwo extends Child implements Contract {

    public ChildTwo(int age, String name, String grade) {
        super(age, name, grade);

    }

    @Override
    public void sayCatchPhrase() {
        System.out.println("I love the Opera!");
    }

    public void sing() {
        System.out.println("La-la-la-la-LLLLLLLLAAAAAAAAAAAA!");
    }

    @Override
    public String returnAnswerToBridgeKeeperQuestion() {
        return "";
    }
}
