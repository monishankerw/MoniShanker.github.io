package org.example.corejava.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Mani", 122222));
        list.add(new Employee(102, "Shanker", 111111));
        list.add(new Employee(103, "Test", 22222));



        // Sorting by ID (natural ordering)
        Collections.sort(list);
        System.out.println("Sorted by ID:");
        for (Employee e : list) {
            System.out.println(e);
        }



        // Sorting by Name using Comparator
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        System.out.println("\nSorted by Name:");
        for (Employee e : list) {
            System.out.println(e);
        }



        // Sorting by Salary using Comparator
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.getSalary(), e2.getSalary());
            }
        });

        System.out.println("\nSorted by Salary:");
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
