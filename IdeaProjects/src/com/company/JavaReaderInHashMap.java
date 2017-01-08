package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Adil Bozov on 10.10.2016 г..
 */
public class JavaReaderInHashMap {

    public static void main(String[] args) throws IOException {

        HashMap<String, ArrayList<Double>> grades = new HashMap<String, ArrayList<Double>>();

        grades.put("Pesho", new ArrayList<Double>() {{add(5.5); add(3.8); add(6.0);}});
        grades.put("Mincho", new ArrayList<Double>(){{add(3.2); add(5.2); add(4.5);}});
        grades.put("Ganka", new ArrayList<Double>(){{add(6d); add(6.0);}});

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("grade.txt"));

        outputStream.writeObject(grades);

        outputStream.close();

    }
}
