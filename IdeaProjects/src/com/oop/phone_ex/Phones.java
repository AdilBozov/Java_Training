package com.oop.phone_ex;

import com.oop.phone_ex.interfaces.BrowsingWWW;
import com.oop.phone_ex.interfaces.Calling;

/**
 * Created by Adil Bozov on 16.10.2016 г..
 */
public class Phones {

    public static void main(String[] args) {

        Calling call = new Phone();
        BrowsingWWW brows = new Phone();
        call.call("0882134215 0882134333 08992134215 0558123 3333 1");
        brows.www("http://softuni.bg http://youtube.com");
        brows.www("11http://www.g00gle.com");

    }
}
