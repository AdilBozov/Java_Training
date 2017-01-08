package com.company;

import java.io.*;

/**
 * Created by Adil Bozov on 11.10.2016 г..
 */
public class CopyJpgJava {

    public static void main(String[] args){
        final String FILE_PATH = "tree.jpg";
        final String SAVE_PATH = "treeCopy.jpg";

//        File imege = new File(FILE_PATH);

        try (
                FileInputStream in = new FileInputStream(new File(FILE_PATH));
                FileOutputStream out = new FileOutputStream(new File(SAVE_PATH))
        ){
            int bytesRead;
            while((bytesRead = in.read()) != -1){
                out.write(bytesRead);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
