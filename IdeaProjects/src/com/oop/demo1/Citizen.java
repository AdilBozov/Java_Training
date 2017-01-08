package com.oop.demo1;

/**
 * Created by Adil Bozov on 15.10.2016 г..
 */
public class Citizen implements Person{

    private String name;

    private int age;

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
