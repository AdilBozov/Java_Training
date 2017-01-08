package com.event_and_communication._1_adapter_pattern;

/**
 * Created by Adil Bozov on 26.10.2016 г..
 */
public class CityGasStation implements GasStation {

    GasStation gasStation;

    @Override
    public void fill(String fuelType, int amount) {
        if (fuelType.equalsIgnoreCase("water")){
            System.out.println(amount + " liters filled");
        } else if(fuelType.equalsIgnoreCase("petrol") ||
                fuelType.equalsIgnoreCase("diesel") ||
                fuelType.equalsIgnoreCase("lpg")){
            this.gasStation = new AdapterGasStation(fuelType);
            this.gasStation.fill(fuelType, amount);
        } else {
            System.out.println("Fuel type is not supported!");
        }
    }
}
