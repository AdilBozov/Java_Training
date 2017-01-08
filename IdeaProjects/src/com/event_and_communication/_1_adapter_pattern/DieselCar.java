package com.event_and_communication._1_adapter_pattern;

/**
 * Created by Adil Bozov on 26.10.2016 г..
 */
public class DieselCar implements Refillable {

    @Override
    public void fillPetrol(int amount) {

    }

    @Override
    public void fillDiesel(int amount) {
        System.out.println(amount + " liters filled");
    }

    @Override
    public void fillLpg(int amount) {

    }
}
