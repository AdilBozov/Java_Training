package com.event_and_communication._2_chain_of_responsibilities_pattern;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public class LocalManager extends BankEmployee{

    @Override
    String getRole() {
        return "Local Manager";
    }

    @Override
    int getAllowable() {
        return 50000;
    }
}
