package java.collection;

/**
 * Created by Adil Bozov on 02.09.2016 г..
 */

import java.util.*;

public class JavaArrayList {

    public static void main(String args[]) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ravi");
        al.add("Ajay");

        Iterator itr = al.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());

        }
    }
}
