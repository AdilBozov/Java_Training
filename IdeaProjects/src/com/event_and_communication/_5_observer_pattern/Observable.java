package com.event_and_communication._5_observer_pattern;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public interface Observable {
    String getScheduleMessage();
    void scheduleDownTime(String message);
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
