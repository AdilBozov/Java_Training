package com.oop.demo2;


import java.util.Scanner;

/**
 * Created by Adil Bozov on 15.10.2016 г..
 */
public class Demo {

    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);
        String driverName = scenner.nextLine();

        Car ferrari = new Ferrari(driverName);
        System.out.println(ferrari.toString());
    }
}
