package com.oop.demo3;

import com.oop.demo3.interfaces.Workable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adil Bozov on 15.10.2016 г..
 */
public class Demo {

    public static void main(String[] args) {

        Human human = new Human();
        Robot robot = new Robot();

        List<Workable> listWorkable = new ArrayList<>();
        listWorkable.add(human);
        listWorkable.add(robot);

        System.out.println(listWorkable.toString());


    }
}
