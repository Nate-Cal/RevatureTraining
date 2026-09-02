package com.revature.classes;



public class OuterAccess {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.publicField);
        System.out.println(obj.protectedField);
        System.out.println(obj.defaultField);
        // This field is inaccessible because private is locked to its class, not its object
//        System.out.println(obj.privateField);

    }
}
