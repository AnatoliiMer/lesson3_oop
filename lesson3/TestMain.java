package lesson3;

import java.util.ArrayList;
import java.util.Collections;

public class TestMain {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        Employee emp1 = new Employee("Sveta", 30, 50000.0);
        Employee emp2 = new Employee("Ivan", 25, 60000.0);
        Employee emp3 = new Employee("Vika", 35, 45000.0);
        Employee emp4 = new Employee("Petr", 40, 55000.0);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        System.out.println("Employees sorted by age:");
        Collections.sort(employees);
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - " + emp.getAge());
        }

        System.out.println("Employees sorted by salary:");
        Collections.sort(employees, new EmployeeSalaryComparator());
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - " + emp.getSalary());
        }
    }
}