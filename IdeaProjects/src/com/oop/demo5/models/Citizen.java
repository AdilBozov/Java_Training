package com.oop.demo5.models;

import com.oop.demo5.interfaces.Buyer;
import com.oop.demo5.interfaces.Identifiable;
import com.oop.demo5.interfaces.Person;

/**
 * Created by Adil Bozov on 19.10.2016 г..
 */
public class Citizen implements Person, Identifiable, Buyer {

    private String name;
    private int age;
    private String id;
    private String birthdate;
    private int food;

    public Citizen(String name, int age, String id, String birthdate) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthdate(birthdate);
        this.setFood(0);
    }

    private void setBirthdate(String birthdate){
        this.birthdate = birthdate;
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
        this.setFood(this.getFood() + 10);
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

    @Override
    public String getId() {
        return id;
    }

    private void setId(String id){
        this.id = id;
    }
}
