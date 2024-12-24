package JAVA.Comparable.AdvanceComporator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "Engineering", 30));
        employees.add(new Employee("Bob", "HR", 25));
        employees.add(new Employee("Charlie", "Engineering", 25));
        employees.add(new Employee("David", "HR", 30));
        employees.add(new Employee("Eve", "Engineering", 30));

        Comparator<Employee> comparator = Comparator
                .comparing(Employee::getDepartment)
                .thenComparing(Employee::getAge)
                .thenComparing(Employee::getName);

        employees.sort(comparator);

        System.out.println("Sorted Employees: " + employees);
    }
}
