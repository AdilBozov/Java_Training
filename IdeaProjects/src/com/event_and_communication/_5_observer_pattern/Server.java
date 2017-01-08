package com.event_and_communication._5_observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public class Server implements Observable{

    private String message;
    private List<Observer> observables;

    public Server(){
        this.observables = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        if(!this.observables.contains(observer)){
            this.observables.add(observer);
        }
    }

    public void removeObserver(Observer observer){
        if (this.observables.contains(observer)){
            this.observables.remove(observer);
        }
    }

    public String getScheduleMessage(){
        return this.message;
    }

    public void scheduleDownTime(String message){
        this.message = message;

        //TODO notify all observers
        notifyObservers();
    }

    public void notifyObservers(){
        List<Observer> clonedObservers = new ArrayList<>(this.observables);

        for (Observer clonedObserver : clonedObservers) {
            clonedObserver.update();
        }
    }

}
