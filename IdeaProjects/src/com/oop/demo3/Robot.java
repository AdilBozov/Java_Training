package com.oop.demo3;

import com.oop.demo3.interfaces.Workable;

/**
 * Created by Adil Bozov on 15.10.2016 г..
 */
public class Robot implements Workable {

    @Override
    public void work() {
        System.out.println("Work Robot");
    }
}
