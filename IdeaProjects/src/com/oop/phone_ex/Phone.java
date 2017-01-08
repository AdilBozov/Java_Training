package com.oop.phone_ex;

import com.oop.phone_ex.interfaces.BrowsingWWW;
import com.oop.phone_ex.interfaces.Calling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Adil Bozov on 16.10.2016 г..
 */
public class Phone implements Calling, BrowsingWWW{

    private static final String MODEL = "Smartphone";

    public static String getMODEL() {
        return MODEL;
    }


    @Override
    public void call(String number) {

        String[] numberSplit = number.split(" ");

       for(int i = 0; i < numberSplit.length; i++){

           if(testCallNumber(numberSplit[i]) == true){
               print("Calling... " + numberSplit[i]);
           }else {
               print("Invalid number!");
           }
       }
    }


    @Override
    public boolean testCallNumber(String number) {

        try {
            int numbers = Integer.parseInt(number);
            return true;
        }catch (NumberFormatException e){
            return false;
        }

    }

    @Override
    public void www(String url) {

        String[] word = url.split(" ");

        for (int i = 0; i < word.length; i++){

            if(testWww(word[i]) == true){
                print("Browsing: " + word[i]);
            }else {
                print("Invalid URL!");
            }
        }

    }

    @Override
    public boolean testWww(String url) {
        Pattern p = Pattern.compile("(http:\\/\\/|https:\\/\\/)?(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?");
        Matcher m = p.matcher(url);
        //m = p.matcher();
        boolean rezult = m.matches();
       // System.out.println(rezult);
        return rezult;
    }

    private void print(String text) {
        System.out.println(text);
    }
}
