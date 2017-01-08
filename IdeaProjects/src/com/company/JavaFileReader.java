package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Adil Bozov on 10.10.2016 г..
 */
public class JavaFileReader {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("big-thingy.txt"));

       // String line = br.readLine();
       // System.out.println(line);

        String line;

        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

    }
}
