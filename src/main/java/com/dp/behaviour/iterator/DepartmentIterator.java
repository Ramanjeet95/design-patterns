package com.dp.behaviour.iterator;

import java.util.Iterator;

public class DepartmentIterator implements Iterator<Employee> {
    private final Employee[] employees;
    private int position = 0;

    public DepartmentIterator(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return position < employees.length && employees[position] != null;
    }

    @Override
    public Employee next() {
        return employees[position++];
    }

    @Override
    public void remove() {
        //Iterator.super.remove();
    }
}
