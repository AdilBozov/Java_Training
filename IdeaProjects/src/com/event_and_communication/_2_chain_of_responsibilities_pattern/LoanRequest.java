package com.event_and_communication._2_chain_of_responsibilities_pattern;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public class LoanRequest {

    private int amount;
    private String purpose;

    public LoanRequest(int amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }

    public int getAmount() {
        return amount;
    }

    private void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    private void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
