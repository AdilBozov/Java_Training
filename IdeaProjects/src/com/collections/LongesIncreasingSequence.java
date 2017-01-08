package com.collections;

import java.util.*;

/**
 * Created by Adil Bozov on 12.10.2016 г..
 */
public class LongesIncreasingSequence {

    public static void main(String[] args){

        String line = "8 9 9 9 -1 5 2 3";

        String[] lineArr = line.split(" ");

        int[] lineArrInt = new int[lineArr.length];


        ArrayList<ArrayList<Integer>> lineList = new ArrayList<>();
//        ArrayList<Integer> list = new ArrayList<>();



        for (int i = 0; i < lineArr.length; i++){
            lineArrInt[i] = Integer.parseInt(lineArr[i]);
        }

        lineList.add(new ArrayList<Integer>());
        lineList.get(0).add(lineArrInt[0]);
        int count = 0;

        for (int i = 1; i < lineArrInt.length; i++){

            if(lineArrInt[i - 1] < lineArrInt[i]){

                lineList.get(count).add(lineArrInt[i]);
            } else {
                lineList.add(new ArrayList<Integer>());
                count++;
                lineList.get(count).add(lineArrInt[i]);
            }
        }

        if(lineList.size() > 0){

            for (int i = 0; i < lineList.size(); i++){
                for(int j = 0; j < lineList.get(i).size(); j++){
                    System.out.print(lineList.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }

        int sizeList = 0;

        for (int i = 1; i < lineList.size(); i++){
            if(lineList.get(i - 1).size() < lineList.get(i).size() ){
                sizeList = i;
            }else {
                sizeList = i - 1;
            }
        }

        for(int j = 0; j < lineList.get(sizeList).size(); j++){
            System.out.print(lineList.get(sizeList).get(j) + " ");
        }





       /*
        list.add(lineArrInt[0]);



       for(int i = 1; i < lineArrInt.length; i++){

            if (lineArrInt[i - 1] < lineArrInt[i]){

                list.add(lineArrInt[i]);

            }else {

                lineList.add(list);
                list.clear();
                list.add(lineArrInt[i]);
            }

        }
        lineList.add(list);*/


    }
}
