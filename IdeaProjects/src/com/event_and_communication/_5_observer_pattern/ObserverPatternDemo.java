package com.event_and_communication._5_observer_pattern;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {

        Observable server = new Server();
        Observer gosho_mosho = new User("gosho_mosho", "gosho_mosho@abv.bg", server);
        Observer Ivan_Ivanov = new User("iavn_Ivano", "Ivanov_klepushko@usshko.com", server);



        server.addObserver(gosho_mosho);
        server.addObserver(Ivan_Ivanov);

        server.scheduleDownTime("Out servers will be unavailable on friday");

        Observer mosho_tosho = new User("mosho_tosho", "mosho_dylgiq@abv.bg", server);

        server.addObserver(mosho_tosho);
        server.scheduleDownTime("We are hosting a party!");
    }
}
