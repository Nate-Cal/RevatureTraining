package com.revature.oop.encapsulation;

import java.util.UUID;

public class Person {
    private final UUID socialSecurityNumber;
    private int age;
    private String name;

    public Person(int age, String name) {
        this.socialSecurityNumber = UUID.randomUUID();
        this.age = age;
        this.name = name;
    }

    public UUID getSocialSecurityNumber(int pin) {
        if (pin == 1234) {
            return socialSecurityNumber;
        }
        return null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
