package com.event_and_communication._2_chain_of_responsibilities_pattern;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public interface Employee {
    void setSuccessor(Employee successor);
    void processRequest(LoanRequest request);
}
