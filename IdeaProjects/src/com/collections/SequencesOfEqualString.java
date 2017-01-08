package com.collections;

import java.util.Scanner;

/**
 * Created by Adil Bozov on 11.10.2016 г..
 */
public class SequencesOfEqualString {

    public static void main(String[] args) {

        //int m = 10;

        Scanner in = new Scanner(System.in);

        String[] arrStr = in.nextLine().split(" ");

        System.out.print(" " + arrStr[0]);


        for (int i = 1; i < arrStr.length; i++){

            if(arrStr[i].equals(arrStr[i - 1])){
                System.out.print(" " + arrStr[i] + " ");
            } else {
                System.out.println();
                System.out.print(" " + arrStr[i]);
               // System.out.println();
            }
        }



    }
}
