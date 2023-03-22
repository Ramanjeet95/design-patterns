package com.dp.behaviour.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Akash");
        Employee e2 = new Employee(2, "Raman");
        Employee e3 = new Employee(1, "Tarun");
        Department department = new Department(1, "IT");

        department.addEmployee(e1);
        department.addEmployee(e2);
        department.addEmployee(e3);

        for (Employee employee : department) {
            System.out.println(employee.getName());
        }

        Iterator<Employee> iterator = department.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
