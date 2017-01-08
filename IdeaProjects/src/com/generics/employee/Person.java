package com.generics.employee;

/**
 * Created by Adil Bozov on 23.10.2016 г..
 */
public class Person implements Comparable<Person>{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
