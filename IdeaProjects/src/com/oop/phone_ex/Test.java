package com.oop.phone_ex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Adil Bozov on 16.10.2016 г..
 */




public class Test {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("(http:\\/\\/|https:\\/\\/)?(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?");
        Matcher m = p.matcher("http://www.g00gle.com");
        //m = p.matcher();
        boolean rezult = m.matches();
        System.out.println(rezult);


    }
}
