package com.dp.behaviour.iterator;

import lombok.Data;

import java.util.Iterator;

@Data
public class Department implements Iterable<Employee> {
    private int id;
    private String name;
    private int position = 0;
    private Employee[] employees = new Employee[100];

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees[position++] = employee;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new DepartmentIterator(employees);
    }
}
