package com.event_and_communication._4_traveler;

/**
 * Created by Adil Bozov on 26.10.2016 г..
 */
public class Traveler {

    private Vehicle car;

    public Traveler(Vehicle car){
        this.car = car;
    }

    public void travel(){
        this.car.move();
    }
}
