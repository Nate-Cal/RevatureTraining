package com.revature;

public class Methods {

    String objectName;
    int objectIdentifier;

    public static void main(String[] args) {

        Methods obj = new Methods();
        Methods obj2 = new Methods("Billy");

        System.out.println();

        obj.changeObjectName("Slagathor");
        obj.changeObjectName("Sally");

    }

    public Methods() {
        Methods.printCreationMessage("This gets called whenever the no args constructor is used");
    }

    public Methods(String objectName) {
        Methods.printCreationMessage("This gets called whenever the full args constructor is used");

        this.changeObjectName(objectName);
    }

    public static void printCreationMessage(String message) {
        System.out.println(message);
    }

    public void changeObjectName (String newName) {

        if (!NewNameValid(newName)) {
            System.out.println("Slagathor is not allowed! Get out of here!");
        } else {
            this.objectName = newName;
            System.out.println("Your new name is now " + this.objectName);
        }
    }

    private boolean NewNameValid (String newName) {
        if (newName == null || newName.equals("Slagathor")) {
            return false;
        }
        return true;
    }

}
