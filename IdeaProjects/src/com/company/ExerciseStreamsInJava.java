package com.company;

import java.io.*;

/**
 * Created by Adil Bozov on 11.10.2016 г..
 */
public class ExerciseStreamsInJava {

    public static void main(String[] args) throws IOException {


        final String FILE_PATH = "users.txt";
        File  file = new File(FILE_PATH);
        BufferedReader reader= new BufferedReader(new FileReader(file));

        final String SAVE_PATH = "total-time.txt";
        File outputFile = new File(SAVE_PATH);
        FileWriter fw = new FileWriter(outputFile, true);
        PrintWriter write = new PrintWriter(fw, true);



        String line = reader.readLine();
        //System.out.println(line);

        while(line != null){

            String[] lineArr = line.split(" ");
            int minutes=0;
            int houts = 0;
           // int days = 0;

            for (int i = 1; i < lineArr.length; i++){

               String[] lineElement = lineArr[i].split(":");
                houts = houts + Integer.parseInt(lineElement[0]);
                minutes = minutes + Integer.parseInt((lineElement[1]));

            }

            minutes = minutes + (houts * 60);
            //houts = (minutes % 1440) % 60;
//            System.out.println(lineArr[0]
//                    + " "
//                    + minutes
//                    + " ("
//                    + minutes / 1440
//                    + ", "
//                    + (minutes % 1440) / 60
//                    + ", "
//                    + (minutes % 1440) % 60
//                    + ")");

            String output = lineArr[0]
                    +" " +String.valueOf(minutes)
                    + " (" + String.valueOf(minutes / 1440)
                    + " days, " + String.valueOf((minutes % 1440) / 60)
                    + " hours, " + String.valueOf((minutes % 1440) % 60)
                    + " minutes)";


            System.out.println(output);
            write.println(output);


            line = reader.readLine();
        }

        write.close();
        reader.close();
    }
}
