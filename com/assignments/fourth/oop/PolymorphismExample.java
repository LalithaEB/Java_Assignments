package oop;

//Polymorphism 
//Method Overloading - Compile time polymorphism
//Method Overriding - Run time polymorphism
public class PolymorphismExample {
    public static void main(String[] args) {
        System.out.println("Sum of 2 integers: " + Addition.add(2, 4));
        System.out.println("Sum of 3 integers: " + Addition.add(5, 6, 9));

        Shape shape;

        shape = new Shape();
        shape.display();

        shape = new Circle();
        shape.display();

        shape = new Triangle();
        shape.display();

    }

}

// This class shows the usage of Compile-time Polymorphism which is acheived by
// Method overloading - add method is overloaded which has same name and are in
// same class but with different parameters

class Addition {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}

// This class shows the usage of Run-time polymorphism which is acheived by
// Method Overriding which is done by inheriting the parent class methods
// Here display method is being overridden in the subclasses

// Parent class
class Shape {
    public void display() {
        System.out.println("This is a generic class");
    }
}

// Derived class which has the overridden method
class Circle extends Shape {
    @Override
    public void display() {
        System.out.println("This is a Circle class");
    }
}

// Derived class which has the overridden method
class Triangle extends Shape {
    @Override
    public void display() {
        System.out.println("This is a Traingle class");
    }
}