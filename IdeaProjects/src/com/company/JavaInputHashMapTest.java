package com.company;

import java.io.*;
import java.util.HashMap;

/**
 * Created by Adil Bozov on 10.10.2016 г..
 */
public class JavaInputHashMapTest {

    public static  void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream inputStream = new ObjectInputStream(
                new BufferedInputStream(
                    new FileInputStream(
                     "gradeTest.txt"
                    ))
                );

        //Object obj = inputStream.readObject();
        HashMap<String, Double> obj = (HashMap<String, Double>)inputStream.readObject();

        System.out.println(obj);
        System.out.println(obj.get("Pesho"));

    }
}
