package com.dp.behaviour.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
public class Company extends Corporate {

    private String name;
    private List<Corporate> corporates = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    @Override
    public void add(Corporate c) {
        corporates.add(c);
    }

    @Override
    public void print() {
        Iterator<Corporate> iterator = iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }

    @Override
    public Iterator<Corporate> iterator() {
        return corporates.iterator();
    }
}
