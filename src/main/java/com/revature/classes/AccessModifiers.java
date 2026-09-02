package com.revature.classes;

public class AccessModifiers {
    public String publicField = "This is public";
    protected String protectedField = "This is protected";
    String defaultField = "This is default";
    private String privateField = "This is private";

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.publicField);
        System.out.println(obj.protectedField);
        System.out.println(obj.defaultField);
        System.out.println(obj.privateField);
    }
}
