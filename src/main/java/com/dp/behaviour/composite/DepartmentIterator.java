package com.dp.behaviour.composite;

import java.util.Iterator;

public class DepartmentIterator implements Iterator<Corporate> {
    private final Corporate[] corporates;
    private int position = 0;

    public DepartmentIterator(Corporate[] corporates) {
        this.corporates = corporates;
    }

    @Override
    public boolean hasNext() {
        return position < corporates.length && corporates[position] != null;
    }

    @Override
    public Corporate next() {
        return corporates[position++];
    }

    @Override
    public void remove() {
        //Iterator.super.remove();
    }
}
