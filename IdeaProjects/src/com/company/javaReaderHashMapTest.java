package com.company;

import java.io.*;
import java.util.HashMap;

/**
 * Created by Adil Bozov on 10.10.2016 г..
 */
public class javaReaderHashMapTest {

    public static void main(String[] args) throws IOException {

        HashMap<String, Double> gradesTest = new HashMap<String, Double>();
        gradesTest.put("Pesho", 5.5);
        gradesTest.put("Goshko", 3.2);
        gradesTest.put("Penka", 4.75);

        ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("gradeTest.txt")
                ));

        oos.writeObject(gradesTest);

        oos.flush();
        oos.close();

    }
}
