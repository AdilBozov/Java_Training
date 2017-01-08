package com.com.streamAPI.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

/**
 * Created by Adil Bozov on 13.10.2016 г..
 */
public class FilterArray {

    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] lineArr = reader.readLine().split(" ");

        String line = "Banica 12 gosho j1k 33 kl bozichka 81 88kl 5562 abcd 8 I te taka";
        String[] lineArr = line.split(" ");

        List<Integer> numbers = Arrays.stream(lineArr)
                .filter(FilterArray::isNumber)
                .map(Integer::parseInt)
                .collect(Collectors.toList());



        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        int sumAnotherWay = numbers.stream().collect(Collectors.summingInt(Integer::intValue));

        int sumReduce = numbers.stream().reduce((x, y) -> x + y).get();

        System.out.println(sum);
        System.out.println(sumAnotherWay);
        System.out.println(sumReduce);



    }

    private static boolean isNumber (String str){
        for(char ch : str.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }
}
