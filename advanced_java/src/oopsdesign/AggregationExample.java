package oopsdesign;



import java.util.ArrayList;
import java.util.List;

public class AggregationExample {
    public static void main(String[] args) {
        // Create Employee objects
        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102);
        Employee emp3 = new Employee("Charlie", 103);

        // Create a list of employees
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Create a Department object that aggregates employees
        Department dept = new Department("Human Resources", employeeList);

        // Display department details
        dept.displayDepartmentInfo();
    }
}
