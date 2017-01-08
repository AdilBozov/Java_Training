package com.company;


import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Adil Bozov on 10.10.2016 г..
 */
public class JavaCharFile  {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("friendly-notepad.txt");

        fw.write("nanananananananan\r\n");
        fw.write("21115\r\n");
        fw.write("opopopopopopopopopo\r\n");
        fw.write(123456);

        fw.flush();
        fw.close();
    }
}
