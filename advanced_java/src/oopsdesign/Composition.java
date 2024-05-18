package oopsdesign;



public class Composition {
    public static void main(String[] args) {
        // Create an Address object
        Address address = new Address("123 Main St", "Springfield", "IL", "62704");

        // Create a Person object composed of the Address object
        Person person = new Person("John Doe", address);

        // Display person's details
        person.displayPersonInfo();
    }
}
