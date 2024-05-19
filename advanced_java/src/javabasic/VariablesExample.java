package javabasic;

public class VariablesExample {

    // Instance variable
    private int instanceVar;

    // Static variable
    private static int staticVar;

    public void method() {
        // Local variable
        int localVar = 10;

        // Accessing instance variable
        System.out.println("Instance variable value: " + instanceVar);

        // Accessing static variable
        System.out.println("Static variable value: " + staticVar);

        // Accessing local variable
        System.out.println("Local variable value: " + localVar);
    }

    public static void main(String[] args) {
        // Creating an object of the class to access instance variables and methods
        VariablesExample obj = new VariablesExample();

        // Assigning values to instance variable and static variable
        obj.instanceVar = 5;
        staticVar = 15;

        // Accessing method to display variables
        obj.method();
    }
}
