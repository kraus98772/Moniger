package com.cosmas.moniger;

import java.util.Date;

public class Transaction {
    private double transactionValue;
    private SimpleDate transactionDate;
    private String transactionCategory, transactionDescription;

    public Transaction(double transactionValue, SimpleDate transactionDate, String transactionCategory, String transactionDescription) {
        this.transactionValue = transactionValue;
        this.transactionDate = transactionDate;
        this.transactionCategory = transactionCategory;
        this.transactionDescription = transactionDescription;
    }

    public double getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(double transactionValue) {
        this.transactionValue = transactionValue;
    }

    public SimpleDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(SimpleDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionCategory() {
        return transactionCategory;
    }

    public void setTransactionCategory(String transactionCategory) {
        this.transactionCategory = transactionCategory;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }
}
