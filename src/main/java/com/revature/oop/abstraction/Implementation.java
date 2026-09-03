package com.revature.oop.abstraction;

public abstract class Implementation {

    public boolean validatePassword(String password) {
        return lengthIsCorrect(password);
    }

    private boolean lengthIsCorrect(String password) {
        return !password.isEmpty() && password.length() <= 15;
    }

}
