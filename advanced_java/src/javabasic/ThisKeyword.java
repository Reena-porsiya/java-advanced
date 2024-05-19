package javabasic;

public class ThisKeyword {
    private String name;
    private int age;

    // Constructor with parameters
    public ThisKeyword(String name, int age) {
        // Use 'this' to distinguish between the instance variable and the constructor parameter
        this.name = name;
        this.age = age;
    }

    // Method to display person's details
    public void displayDetails() {
        // Use 'this' to refer to the instance variables within the class
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Method to update person's age
    public void updateAge(int newAge) {
        // Use 'this' to refer to the instance variable and method parameter
        if (newAge > this.age) {
            this.age = newAge;
            System.out.println("Age updated successfully!");
        } else {
            System.out.println("New age must be greater than current age.");
        }
    }

    public static void main(String[] args) {
        // Create a Person object
    	ThisKeyword person1 = new ThisKeyword("John", 30);

        // Display person's details
        person1.displayDetails();

        // Update person's age
        person1.updateAge(35);

        // Display updated details
        person1.displayDetails();
    }
}
