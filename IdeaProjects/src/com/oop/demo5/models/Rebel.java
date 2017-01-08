package com.oop.demo5.models;

import com.oop.demo5.interfaces.Buyer;
import com.oop.demo5.interfaces.Person;

/**
 * Created by Adil Bozov on 19.10.2016 г..
 */
public class Rebel implements Person, Buyer {

    private String name;
    private int age;
    private int food;
    private String group;

    public Rebel(String name, int age, String group) {
        this.setName(name);
        this.setAge(age);
        this.setGroup(group);
        this.setFood(0);
    }

    public String getGroup() {
        return group;
    }

    private void setGroup(String group) {
        this.group = group;
    }

    @Override
    public int getFood() {
        return food;
    }

    private void setFood(int food){
        this.food = food;
    }

    @Override
    public void buyFood() {
        this.setFood(this.getFood() + 5);
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name){
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    private void setAge(int age){
        this.age = age;
    }
}
