package javabasic;
//Passing Information to a Method or a Constructor in java

public class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor with parameters
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Creating an Employee object using constructor with parameters
        Employee emp1 = new Employee("John Doe", 30, 50000.0);
        emp1.displayDetails();

        // Calling a method with parameters
        double bonusAmount = calculateBonus(emp1.salary);
        System.out.println("Bonus Amount: $" + bonusAmount);
    }

    // Method with parameters
    public static double calculateBonus(double salary) {
        // Assuming bonus is 10% of the salary
        return salary * 0.10;
    }
}
