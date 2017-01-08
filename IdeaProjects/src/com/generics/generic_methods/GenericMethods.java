package com.generics.generic_methods;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adil Bozov on 23.10.2016 г..
 */
public class GenericMethods {



        public static <T> List<T> createList (T value, int count){
            List<T> genericList = new ArrayList<T>();

            for (int i = 0; i < count; i++) {
                genericList.add(value);
            }

            return genericList;
        }

    public static  <T> void printClass(T item){
        System.out.println(item.getClass().getName());
    }

    public static <T extends Comparable<T>> T getMax(List<T> listss){
        T max = listss.get(0);

        for (int i = 0; i < listss.size(); i++) {
            if (max.compareTo(listss.get(i)) < 0) {
                max = listss.get(i);
            }
        }
        return max;
    }

}
