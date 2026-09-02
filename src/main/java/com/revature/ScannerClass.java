package com.revature;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        // Modern way of using Scanner, no need to manual close scanner. use "try"
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("What is your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello " + name);
        }
    }

    public static void manualOpenClose() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.print("How old are you: ");
        // Recommended approach
//        String ageAsString = scanner.nextLine();
//        int age = Integer.parseInt(ageAsString);
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Got it, you are " + age + " years old");
        System.out.print("Where do you work: ");
        String location = scanner.nextLine();
        System.out.println("You work in " + location);
        scanner.close();
    }

}
