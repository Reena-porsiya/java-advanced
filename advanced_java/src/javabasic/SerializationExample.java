package javabasic;

import java.io.*;

// Serializable class
class Employees implements Serializable {
    private static final long serialVersionUID = 1L; // Generated unique identifier
    private String name;
    private transient int age; // transient keyword prevents this field from being serialized

    // Constructor
    public Employees(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        // Serialization
        try {
            // Create an Employee object
            Employees employee = new Employees("John Doe", 30);

            // Serialize the object to a file
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employee);
            out.close();
            fileOut.close();
            System.out.println("Employee object serialized and saved to employee.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try {
            // Read the serialized object from the file
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Employees employee = (Employees) in.readObject(); // Cast to Employee
            in.close();
            fileIn.close();

            // Display the deserialized object
            System.out.println("Deserialized Employee object:");
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
