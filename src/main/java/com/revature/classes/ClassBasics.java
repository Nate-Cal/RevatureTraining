package com.revature.classes;

import java.util.Objects;

public class ClassBasics {
    int identifier;
    static int count = 0;

    public ClassBasics() {
        ClassBasics.count++;
    }

    public static void main(String[] args) {
        System.out.println(ClassBasics.count);
        ClassBasics myObject = new ClassBasics();
        System.out.println(ClassBasics.count);
        myObject.identifier = 1;

        ClassBasics anotherObject = new ClassBasics();
        System.out.println(ClassBasics.count);
        anotherObject.identifier = 2;

        System.out.println("myObject identifier = " + myObject.identifier);
        System.out.println("anotherObject identifier = " + anotherObject.identifier);

        System.out.println(myObject);
        System.out.println(anotherObject);

        String stringObject = "This is a string";
        Integer integerObject = Integer.valueOf(100);
        integerObject.equals(stringObject);


    }

    // Generated toString Override using Cmd + N
    @Override
    public String toString() {
        return "ClassBasics{" +
                "identifier=" + identifier +
                '}';
    }

    // Manually written toString Override to reference identifier and not memory location
    //    @Override
//    public String toString() {
//        return "identifier = " + this.identifier;
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ClassBasics that = (ClassBasics) o;
        return identifier == that.identifier;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identifier);
    }

}
