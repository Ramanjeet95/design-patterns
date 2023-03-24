package com.dp.behaviour.composite;

import lombok.Data;

import java.util.Iterator;

@Data
public class Department extends Corporate implements Iterable<Corporate> {

    private String name;
    private int position = 0;

    // employees, sub-division , dept..
    private Corporate[] corporates = new Corporate[100];

    public Department(String name) {
        this.name = name;
    }

    public void add(Corporate corporate) {
        corporates[position++] = corporate;
    }

    @Override
    public Iterator<Corporate> iterator() {
        return new DepartmentIterator(corporates);
    }


    @Override
    public void print() {
        System.out.println("--- " + name + "----");
        Iterator<Corporate> iterator = iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }

    }
}

