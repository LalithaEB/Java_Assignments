package oop;

public class AccessModifiersExample {
    public static void main(String[] args) {
        AccessModifiers access = new AccessModifiers();

        System.out.println("Public field " + access.a);
        // System.out.println("Private field " + access.b);
        System.out.println("Protected field " + access.c);
        System.out.println("Default field " + access.d);

        access.publicMethod();
        // access.privateMethod();
        access.protectedMethod();
        access.defaultMethod();
    }
}

class AccessModifiers {
    // Public field can be accessed from any other class
    public int a = 10;

    // Private can be accessible only within the same class
    // private int b = 20;

    // Protected can be accessed by any class within same package and by sub-classes
    // in different package
    protected int c = 30;

    // if no access modifier is specified by default it has package access which
    // means it can be accessed within same package
    int d = 40;

    public void publicMethod() {
        System.out.println("Public method");
    }

    // private void privateMethod() {
    // System.out.println("Private method");
    // }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }
}