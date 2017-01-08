package com.collections;

/**
 * Created by Adil Bozov on 12.10.2016 г..
 */
public class LargesSequenceOfEqualString {

    public static void main(String[] args) {

        String line = "hi hi hi hi hi"; // 1 1 2 2 3 3 4 4 5 5 hi yes yes yes bye
        String[] lineArr = line.split(" ");

        int lengString = 1;
        int saveLengString = 0;
        String value = " ";

        for (int i = 1; i < lineArr.length; i++){

            if(lineArr[i - 1].equals(lineArr[i])){
                lengString++;

            }else {
                lengString = 1;
            }

            if(lengString > saveLengString){
                saveLengString = lengString;
                value = lineArr[i];
            }
        }

        for (int i = 0; i < saveLengString; i++ ){
            System.out.print(value + " ");
        }
    }
}
