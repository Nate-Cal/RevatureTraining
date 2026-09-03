package com.revature.oop.abstraction;

public class API extends Implementation {

    public static void main(String[] args) {
//        Implementation obj = new Implementation();

        API obj = new API();
        System.out.println(obj.validatePassword("valid"));
        System.out.println(obj.validatePassword(""));

    }

}
