package javabasic;

public class ObjectReferenceExample {

    public static void main(String[] args) {
        // Declare a variable of type String
        String str;

        // Assign an object to the variable
        str = new String("Hello, World!");

        // Print the value of the variable
        System.out.println("Value of str: " + str);

        // Declare and assign another variable to refer to the same object
        String anotherStr = str;

        // Print the value of the second variable
        System.out.println("Value of anotherStr: " + anotherStr);

        // Modify the original object using one variable
        str = str.toUpperCase();

        // Print the modified value using both variables
        System.out.println("Modified value of str: " + str);
        System.out.println("Modified value of anotherStr: " + anotherStr);
    }
}
