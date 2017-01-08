package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Adil Bozov on 10.10.2016 г..
 */
public class WriterJavaFileAndShuffle {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("big-thingy.txt");

        List<Character> arr = new ArrayList<Character>();
        int index = 0;

        for(char c = 'a'; c <= 'z'; c++){
            arr.add(c);
        }

        Collections.shuffle(arr);

        for (int i = 0; i < 212; i++){
            fw.write("blblbl (" + (i + 1) + ") " + arr + "\r\n");
            Collections.shuffle(arr);
        }

        fw.close();
    }
}
