package com.dp.behaviour.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Iterator;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class Employee extends Corporate {
    private String name;


    @Override
    public void print() {
        System.out.println("Employee:: " + name);
    }

    public Iterator<Corporate> iterator() {
        return new EmployeeIterator(this);
    }

}
