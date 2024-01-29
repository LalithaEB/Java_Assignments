package oop;

public class StaticExample {
    public static void main(String[] args) {
        // Creating objects of class
        StaticExample example1 = new StaticExample();

        // Static method is called using Class name
        StaticExample.staticMethod();
        System.out.println("Static value = " + staticValue);

        // Non-static method is called using objects or instances
        example1.nonStaticMethod();
        System.out.println("Non-static value = " + example1.nonStaticValue);
    }

    // Static variable or class variable
    private static int staticValue = 0;

    // Non-static variable or Instance variable
    private int nonStaticValue = 0;

    // Constructor
    public StaticExample() {
        System.out.println("Constructor");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static method");
        staticValue++;
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("Non-static method");
        nonStaticValue++;
    }

    // static block is executed when class is loaded
    static {
        System.out.println("Static block");
    }
}
