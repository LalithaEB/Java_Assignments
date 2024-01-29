package oop;

//Abstraction and Data hiding Example also covered in this program

public class AbstractClass {
    public static void main(String[] args) {
        Car car = new Car("Red", 4);
        System.out.println("Car Information");
        car.printInformation();
        car.start();
        car.stop();

        Bike bike = new Bike("Black", 2);
        System.out.println("Bike information");
        bike.printInformation();
        bike.start();
        bike.stop();
    }
}

// abstract class - they contain abstract methods which has to be implemented by
// the subclass extending it and also contain concrete methods.
abstract class Vehicle {

    private String color;
    private int noOfWheels;

    public Vehicle(String color, int noOfWheels) {
        this.color = color;
        this.noOfWheels = noOfWheels;
    }

    // abstract methods - which has to be implemented by subclasses
    public abstract void start();

    public abstract void stop();

    // concrete methods - which has implementation
    public void printInformation() {
        System.out.println("Color: " + color + "\nNo. of Wheels: " + noOfWheels);
    }
}

// concrete subclass(Car and Bike) which has implementation of superclass's
// abstract methods
class Car extends Vehicle {

    public Car(String color, int noOfWheels) {
        super(color, noOfWheels);
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

}

class Bike extends Vehicle {

    public Bike(String color, int noOfWheels) {
        super(color, noOfWheels);
    }

    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }

}
