package com.oop.demo2;

import javafx.beans.binding.StringBinding;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Adil Bozov on 15.10.2016 г..
 */
public class Ferrari implements Car{

    private static final String MODEL = "488-Spider";

    private String driverName;

    public Ferrari(String driverName) {
        this.setDriverName(driverName);
    }

    @Override
    public String getMODEL() {
        return MODEL;
    }

    public String getDriverName() {
        return driverName;
    }

    private void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gasPedal() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getMODEL())
                .append("/")
                .append(this.brakes())
                .append("/")
                .append(gasPedal())
                .append("/")
                .append(getDriverName());
        return stringBuilder.toString();
    }
}
