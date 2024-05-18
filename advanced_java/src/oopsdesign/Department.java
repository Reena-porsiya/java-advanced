package oopsdesign;


import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees; // Aggregation

    // Constructor
    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    // Method to display department details
    public void displayDepartmentInfo() {
        System.out.println("Department: " + name);
        System.out.println("Employees:");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }
}
