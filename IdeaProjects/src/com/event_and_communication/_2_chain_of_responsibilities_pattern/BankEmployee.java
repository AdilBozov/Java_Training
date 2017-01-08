package com.event_and_communication._2_chain_of_responsibilities_pattern;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public abstract class BankEmployee implements Employee {

    private Employee successor;

    abstract String getRole();
    abstract int getAllowable();

    public void setSuccessor(Employee successor){
        this.successor = successor;
    }

    public void processRequest(LoanRequest request){
        if(request.getAmount() <= this.getAllowable()){
            System.out.println(this.getRole() + " approved the request!");
        } else if(this.successor != null){
            this.successor.processRequest(request);
        }
    }
}
