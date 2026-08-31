package com.revature;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
    public static void main(String[] args) {

        List<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);

        System.out.println(myNumbers.getFirst());

        // Helper Classes
        int myNumber = Integer.parseInt("23");
        System.out.println(myNumber);
    }
}
