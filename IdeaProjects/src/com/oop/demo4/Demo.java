package com.oop.demo4;


import com.oop.demo4.interfaces.Birthable;
import com.oop.demo4.interfaces.Identifiable;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by Adil Bozov on 15.10.2016 г..
 */
public class Demo {

    public static void main(String[] args) {

        Class[] citizenInterfaces = Citizen.class.getInterfaces();
        if (Arrays.asList(citizenInterfaces).contains(Birthable.class)
                && Arrays.asList(citizenInterfaces).contains(Identifiable.class)) {
            Method[] methods = Birthable.class.getDeclaredMethods();
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
            methods = Identifiable.class.getDeclaredMethods();
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String id = scanner.nextLine();
            String birthdate = scanner.nextLine();
            Identifiable identifiable = new Citizen(name,age,id,birthdate);
            Birthable birthable = new Citizen(name,age,id,birthdate);
        }

    }
}
