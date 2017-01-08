package com.oop.demo4;


import com.oop.demo4.interfaces.Birthable;
import com.oop.demo4.interfaces.Identifiable;
import com.oop.demo4.interfaces.Person;

/**
 * Created by Adil Bozov on 15.10.2016 г..
 */
public class Citizen implements Person, Birthable, Identifiable{

    private String name;

    private int age;

    private String birthdate;

    private String id;

    public Citizen(String name, int age, String id, String birthdate) {
        this.setName(name);
        this.setAge(age);
        this.setBirthdate(birthdate);
        this.setId(id);
    }

    public String getBirthdate() {
        return birthdate;
    }

    private void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
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

