package com.revature.classes.inner;

import com.revature.classes.AccessModifiers;

public class InnerAccess extends AccessModifiers {
    public static void main(String[] args) {
        InnerAccess obj = new InnerAccess();
        System.out.println(obj.publicField);
        // Using "extends" gives access to protectedField as an inherited resource
        System.out.println(obj.protectedField);
        // These fields are inaccessible because protected and default are locked to their package
//        System.out.println(obj.defaultField);
//        System.out.println(obj.privateField);
    }
}
