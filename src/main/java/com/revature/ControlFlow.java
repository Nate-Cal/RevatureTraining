package com.revature;

public class ControlFlow {
    public static void main(String[] args) {
        System.out.println("User");


        String name = "Billy";
        if (name.equals("Sally")) {
            System.out.println("Welcome Sally");
        } else if (name.equals("Slagathor")) {
            System.out.println("How did you get in here????");
        } else {
            System.out.println("Welcome newcomer!");
        }

        // Comparison Operators <, >, <=, >=, !
        int x = 1;
        int y = 2;
        if (x > y) System.out.println("X is greater than y");
        if (!(x > y)) System.out.println("X is less than y");
        String password = "Super-Secret";
        String username = "Super-User";
        if (!password.equals(username)) {
            System.out.println("Password checks out");
        }

        // AND (&&) Operator

        if (true) {
            if (true) {
                if (false) {
                    if (true) {

                    }
                }
            }
        }

        boolean CorrectLength = true;
        boolean IncludesUppercase = true;
        boolean IncludeLowercase = false;
        boolean IncludeNumber = true;

        if (CorrectLength && IncludesUppercase && IncludeLowercase && IncludeNumber) {
            System.out.println("Password set");
        } else {
            System.out.println("Invalid Password");
        }

        // OR (||) Operator
        String visitor = "Slagathor";
        if (visitor.equals("Billy") || visitor.equals("Sally")) {
            System.out.println("Welcome in friend!");
        } else {
            System.out.println("Get out of her Slagathor");
        }


    }
}
