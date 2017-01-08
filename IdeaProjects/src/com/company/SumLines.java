package com.company;

import java.io.*;

/**
 * Created by Adil Bozov on 11.10.2016 г..
 */
public class SumLines {

    public static void main(String[] args) throws IOException {

        final String FILE_PATH = "lines.txt";
        BufferedReader reader = new BufferedReader(new FileReader(new File(FILE_PATH)));

        String line = reader.readLine();

        while (line != null) {
            String[] lineArr = line.split("");
            int sumChar = 0;

            for (int i = 0; i < lineArr.length; i++) {
//                int charInt = lineArr[i].charAt(0);
                sumChar = sumChar + lineArr[i].charAt(0);
//                 System.out.println(sumChar);
            }
            System.out.println(sumChar);
            line = reader.readLine();
        }

        reader.close();

    }
}
