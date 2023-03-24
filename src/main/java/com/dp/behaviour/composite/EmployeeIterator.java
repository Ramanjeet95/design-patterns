package com.dp.behaviour.composite;

import java.util.Iterator;

public class EmployeeIterator implements Iterator<Corporate> {

    private final Corporate c;

    public EmployeeIterator(Corporate c) {
        this.c = c;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Corporate next() {
        return c;
    }

    @Override
    public void remove() {
        // do nothing
    }
}
