package com.com.streamAPI.java;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Adil Bozov on 13.10.2016 г..
 */
public class SortArrayWithStreamAPI {

    public static void main(String[] args){

        String line = "6 8 3 1 7 2 2 5";

        String[] lineArr = line.split(" ");

        Arrays.stream(lineArr)
                .map(Integer::parseInt)
                .sorted()
                .forEach(p ->{
            System.out.print(p + " ");
        });

        System.out.println();

        Arrays.stream(lineArr)
                .map(Integer::parseInt)
                .sorted((f1, f2) -> f2.compareTo(f1))
                .forEach( p -> {
            System.out.print(p + " ");
        });

        System.out.println();

        Arrays.stream(lineArr)
                .map(Integer::parseInt)
                .distinct()
                .sorted((f1, f2) -> f2.compareTo(f1))
                .forEach( p -> {
                    System.out.print(p + " ");
                });


    }
}
