package javabasic;

public class Constructors {
    private String brand;
    private String model;
    private int year;

    // Default constructor
    public Constructors() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Parameterized constructor
    public Constructors(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Using default constructor
    	Constructors car1 = new Constructors();
        System.out.println("Car 1 details:");
        car1.displayDetails();
        System.out.println();

        // Using parameterized constructor
        Constructors car2 = new Constructors("Toyota", "Camry", 2022);
        System.out.println("Car 2 details:");
        car2.displayDetails();
    }
}
