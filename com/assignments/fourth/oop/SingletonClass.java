package oop;

public class SingletonClass {
    // fields should be private static
    private static SingletonClass instance;

    // private constructor to prevent access to other classes
    private SingletonClass() {
    }

    // public method to give global access
    public static SingletonClass getInstance() {
        // lazy initialization if instance is not created
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    public void print() {
        System.out.println("Print method in Singleton class");
    }

    public static void main(String[] args) {
        // static method getInstance() accessed through class reference
        SingletonClass instance1 = SingletonClass.getInstance();
        SingletonClass instance2 = SingletonClass.getInstance();

        // instance1 & instance2 will point to same memory in the heap
        instance1.print();
        instance2.print();
    }
}
