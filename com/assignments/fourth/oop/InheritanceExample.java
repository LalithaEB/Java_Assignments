package oop;

public class InheritanceExample {

    public static void main(String[] args) {

        // creating object of subclass and passing values through constructor
        CarinInheritance car = new CarinInheritance("Red", 4, "Skoda");
        System.out.println("Car Information");
        car.printInformationCar();

    }
}

// Parent class which has private fields and getters and constructor
class VehicleinInheritance {

    private String color;
    private int noOfWheels;

    public VehicleinInheritance(String color, int noOfWheels) {
        this.color = color;
        this.noOfWheels = noOfWheels;
    }

    // getter methods
    public String getColor() {
        return color;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void printInformation() {
        System.out.println("Color: " + color + "\nNo. of Wheels: " + noOfWheels);
    }
}

// Subclass extending Parent class using extends keyword and also inherits the
// functionality of parent class
class CarinInheritance extends VehicleinInheritance {
    private String brandName;

    public CarinInheritance(String color, int noOfWheels, String brandName) {
        //Calling super class constructor
        super(color, noOfWheels);

        // this keyword which refers to current instance variable
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void printInformationCar() {
        printInformation();
        System.out.println("Brand Name: " + brandName);
    }
}