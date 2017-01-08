package com.oop.demo5;

import com.oop.demo5.interfaces.Buyer;
import com.oop.demo5.models.Citizen;
import com.oop.demo5.models.Rebel;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Adil Bozov on 19.10.2016 г..
 */
public class Main {

    public static void main(String[] args) {

        Map<String, Buyer> buyers = new LinkedHashMap<String, Buyer>();
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < people; i++){
            String[] parameters = scanner.nextLine().split(" ");
            if(parameters.length == 3){
                buyers.put(parameters[0], new Rebel(parameters[0], Integer.parseInt(parameters[1]), parameters[2]));
            } else if(parameters.length == 4){
                buyers.put(parameters[0], new Citizen(parameters[0], Integer.parseInt(parameters[1]),parameters[2], parameters[3]));
            }
        }

        String line = scanner.nextLine();

        while (!line.equals("End")){
            if(buyers.containsKey(line)){
                buyers.get(line).buyFood();
            }
            line = scanner.nextLine();
        }
        System.out.println(buyers.values().stream().mapToInt(x -> x.getFood()).sum());
    }
}
