import java.util.*;

// Employee class
class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + salary;
    }
}

// Main class
public class SortEmployees {
    public static void main(String[] args) {
        // Creating list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(103, "Ravi", 45000));
        employees.add(new Employee(101, "Amit", 55000));
        employees.add(new Employee(102, "Neha", 40000));

        System.out.println("Before Sorting:");
        employees.forEach(System.out::println);

        // Sorting by Employee name using Lambda Expression
        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));

        System.out.println("\nAfter Sorting by Name:");
        employees.forEach(System.out::println);

        // Sorting by Salary using Lambda Expression
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));

        System.out.println("\nAfter Sorting by Salary:");
        employees.forEach(System.out::println);
    }
}
