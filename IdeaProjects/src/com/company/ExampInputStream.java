package com.company;

import java.io.*;

/**
 * Created by Adil Bozov on 09.10.2016 г..
 */
public class ExampInputStream {

    public static void main(String[] args) throws IOException {

        DataInputStream dis
                = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream("mydata.txt")
                        )
        );

        String name = dis.readUTF();
        System.out.println(name);
        int grade = dis.readInt();
        System.out.println(grade);

        dis.close();
    }
}
