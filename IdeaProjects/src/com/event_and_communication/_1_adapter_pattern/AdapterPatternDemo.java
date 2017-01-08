package com.event_and_communication._1_adapter_pattern;

/**
 * Created by Adil Bozov on 26.10.2016 г..
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {

        GasStation gasStation = new CityGasStation();

        gasStation.fill("petrol", 100);
        gasStation.fill("lpg", 35);
    }
}
