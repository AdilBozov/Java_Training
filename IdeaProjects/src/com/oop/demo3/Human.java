package com.oop.demo3;

import com.oop.demo3.interfaces.Eatable;
import com.oop.demo3.interfaces.Sleepable;
import com.oop.demo3.interfaces.Workable;

/**
 * Created by Adil Bozov on 15.10.2016 г..
 */
public class Human implements Eatable, Sleepable, Workable{

    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void work() {
        System.out.println("Work human");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep");
    }
}
