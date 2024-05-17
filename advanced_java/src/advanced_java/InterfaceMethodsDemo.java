package advanced_java;

interface Vehicle {
    // Abstract method
    void start();

    // Default method
    default void stop() {
        System.out.println("The vehicle is stopping.");
    }

    // Static method
    static void service() {
        System.out.println("The vehicle is being serviced.");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("The car is starting.");
    }

    // Optionally override the default method
    @Override
    public void stop() {
        System.out.println("The car is stopping.");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("The bike is starting.");
    }

    // Using the default stop method from Vehicle interface
}

public class InterfaceMethodsDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();  // Calls the overridden stop method in Car

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();  // Calls the default stop method from Vehicle interface

        // Calling the static method from Vehicle interface
        Vehicle.service();
    }
}
