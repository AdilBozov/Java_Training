package com.event_and_communication._5_observer_pattern;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public class User implements Observer{

    private String username;
    private String emailAddress;
    private Observable observable;

    public User(String username, String emailAddress, Observable o) {
        this.username = username;
        this.emailAddress = emailAddress;

        this.observable = o;
    }

    public String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    private void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setObservable(Observable observable){
        this.observable = observable;
    }

    public void update(){
        read();
        unsubscribe();
    }

    private void read(){
        System.out.println(this.getUsername() + " received:");
        System.out.println(this.observable.getScheduleMessage());
    }

    public void unsubscribe(){
        this.observable.removeObserver(this);
    }


}
