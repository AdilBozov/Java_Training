package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Adil Bozov on 11.10.2016 г..
 */
public class AllCapitals {

    public static void main(String[] args) throws IOException {

        final String FILE_PATH = "lines.txt";
        BufferedReader reader = new BufferedReader(new FileReader(new File(FILE_PATH)));

        PrintWriter writer = new PrintWriter(new FileWriter(new File(FILE_PATH), true), true);

        String line = reader.readLine();
        List<String> lineArr = new ArrayList<String>();

        while (line != null) {
//            String newLine = line.toUpperCase();
//            System.out.println(newLine);
            lineArr.add(line.toUpperCase());
//            writer.println(newLine);
            line = reader.readLine();
        }

        Iterator itr = lineArr.iterator();

        while (itr.hasNext()){
            writer.println(itr.next());
        }
    }
}
