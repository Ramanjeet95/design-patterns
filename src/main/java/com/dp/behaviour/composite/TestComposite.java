package com.dp.behaviour.composite;

public class TestComposite {

    public static void main(String[] args) {

        Company company = new Company("Abc Comp");

        Employee e1 = new Employee("Ajay");
        Employee e2 = new Employee("Vijay");
        Employee e3 = new Employee("Nikita");

        Department d1 = new Department("IT");
        Department d2 = new Department("HR");
        d1.add(e2);
        d2.add(e3);

        company.add(e1);
        company.add(d1);
        company.add(d2);

        company.print();
    }
}
