package com.event_and_communication._2_chain_of_responsibilities_pattern;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        BankEmployee clerk = new Clerk();
        BankEmployee manager = new LocalManager();

        LoanRequest loan = new LoanRequest(8000, "Studies");

        clerk.setSuccessor(manager);

        clerk.processRequest(loan);
    }
}
