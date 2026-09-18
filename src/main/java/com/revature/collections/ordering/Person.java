package com.revature.collections.ordering;

import java.util.Set;
import java.util.TreeSet;

/*
    If we intend to allow for the natural ordering of our custom classes we need
    to implement the Comparable interface. This interface gives access to the
    compareTo method which we override with our own comparison algorithm
 */
public class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        /*
            This tells our code that we want to naturally organize
            the person class by the name value
         */
        //return this.name.compareTo(o.name);

        /*
            This tells our code that we want to naturally organize
            the person class by the age value
         */
        //return this.age - o.age;

        int ageGap = this.age - o.age;
        if (ageGap == 0) {
            return this.name.compareTo(o.name);
        }
        return ageGap;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person slagathor = new Person("Slagathor", 1000);
        Person billy = new Person("Billy", 20);
        Person sally = new Person("Sally", 20);

        TreeSet<Person> peopleOrganizedByAge = new TreeSet<>(Set.of(slagathor, billy, sally));
        System.out.println(peopleOrganizedByAge);

        System.out.println();

        TreeSet<Person> peopleOrganizedByName = new TreeSet<>(new SortByName());
        peopleOrganizedByName.addAll(Set.of(slagathor, sally, billy));
        sally.age = 19;
        System.out.println(peopleOrganizedByName);

    }
}
