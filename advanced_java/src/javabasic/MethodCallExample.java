package javabasic;

class Car {
    String brand;
    String model;

    // Constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    // Method to start the car
    public void start() {
        System.out.println("Starting the " + brand + " " + model);
    }

    // Method to stop the car
    public void stop() {
        System.out.println("Stopping the " + brand + " " + model);
    }
}

public class MethodCallExample {

    public static void main(String[] args) {
        // Create a Car object
        Car car1 = new Car("Toyota", "Camry");

        // Call methods on the car object
        car1.displayDetails();
        car1.start();
        car1.stop();
    }
}
