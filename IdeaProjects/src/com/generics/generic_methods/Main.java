package com.generics.generic_methods;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adil Bozov on 23.10.2016 г..
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> list = GenericMethods.createList(0, 10);
        System.out.println(list);

        List<String> stringlist = GenericMethods.createList("gosho", 10);
        System.out.println(stringlist);

        GenericMethods.printClass(12);
        GenericMethods.printClass("goshko");


        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(12);
        integers.add(14);
        integers.add(15);
        System.out.println(GenericMethods.getMax(integers));
     }


}
