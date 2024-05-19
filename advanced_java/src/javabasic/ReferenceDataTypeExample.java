package javabasic;

class Person {
    String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Method to change the name of a person
    public void changeName(String newName) {
        this.name = newName;
    }
}

public class ReferenceDataTypeExample {

    // Method to change the name of a Person object
    public static void changePersonName(Person person, String newName) {
        person.changeName(newName);
    }

    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("John Doe");

        System.out.println("Before method call - Name: " + person.name);

        // Calling method to change the name
        changePersonName(person, "Jane Smith");

        System.out.println("After method call - Name: " + person.name);
    }
}
