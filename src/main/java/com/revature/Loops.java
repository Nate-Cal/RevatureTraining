package com.revature;

import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {

        // Deterministic Loop (For)
        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }

        System.out.println();

        // Loop over data
        int[] myEmptyNumbers = new int[10];
        int[] myNumbers = {1,2,3,4,5,6,7,8,9,10};

        // Iterating over data manually
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]);
        }

        System.out.println();

        // Enhanced For Loop for iterating over data automatically
        for (int number : myNumbers) {
            System.out.println(number);
        }

        System.out.println();

        // Undeterministic Loop (While)
        int count = 1;
        // Standard While Loop
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
        // Do-While Loop
        do {
            System.out.println("This will print even though we hard code false below");
        } while(false);


    }
}
