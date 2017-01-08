package com.company;


import java.io.*;

/**
 * Created by Adil Bozov on 09.10.2016 г..
 */
class StreamJavaExam {

    public static void main(String[] args) throws IOException {

        DataOutputStream mydata
                = new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(
                                        new File("mydata.txt")
                                )
                        )
        );

        mydata.writeUTF("pesho");
        mydata.writeInt(6);
        mydata.flush();

        mydata.close();

    }


}
