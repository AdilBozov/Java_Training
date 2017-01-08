package com.com.streamAPI.java;


import java.util.Arrays;

/**
 * Created by Adil Bozov on 13.10.2016 г..
 */
public class FilterArraysString {

    public static void main(String[] args) {

        String lineStr = "Gosho gos pesho pes blabla bla";

        String[] lineArrStr = lineStr.split(" ");

        Arrays.stream(lineArrStr).filter(p -> p.length() >= 5).forEach(System.out::println);

    }
}
