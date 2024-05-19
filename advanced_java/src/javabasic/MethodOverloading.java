package javabasic;

public class MethodOverloading {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    // Main method to test method overloading
    public static void main(String[] args) {
    	MethodOverloading calc = new MethodOverloading();

        System.out.println("Addition of 2 and 3: " + calc.add(2, 3));
        System.out.println("Addition of 2, 3, and 5: " + calc.add(2, 3, 5));
        System.out.println("Addition of 2.5 and 3.5: " + calc.add(2.5, 3.5));
        System.out.println("Concatenation of 'Hello' and 'World': " + calc.add("Hello", "World"));
    }
}
