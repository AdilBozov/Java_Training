package com.collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Adil Bozov on 11.10.2016 г..
 */
public class SortArrayOfNumbers {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int arrLenght = in.nextInt();

        int[] arr = new int[arrLenght];
        int i = 0;
        System.out.println("Enter array : ");
        while (i < arrLenght){
            System.out.println("Enter element - " + i);
            arr[i] = in.nextInt();
            i++;
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        in.close();

    }
}
