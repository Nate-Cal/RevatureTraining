package com.revature;

public class Strings {
    public static void main(String[] args) {
        // Creating Strings
        String name = "Billy";
        String nameAgain = new String("Billy");
        String name2 = "Billy";

        // Comparing Strings
        System.out.println(name == nameAgain);
        System.out.println(name == name2);

        boolean stringsAreEqual = name.equals(nameAgain);
        System.out.println(stringsAreEqual);

        // Concatenating Strings
        System.out.println();
        System.out.println(name);
        name = name + " Billyson";
        System.out.println(name);
        System.out.println(name2);

        // String Manipulation
        System.out.println();
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(6));
        System.out.println(name.substring(6,12));


    }
}
