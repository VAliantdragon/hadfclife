package org.example.entity;

public class BankAccount {

    private int custID;
    private String custName;
    private long custAccountNumber;
    private double custAccountBalance;
    private int limit;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }



    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public long getCustAccountNumber() {
        return custAccountNumber;
    }

    public void setCustAccountNumber(long custAccountNumber) {
        this.custAccountNumber = custAccountNumber;
    }

    public double getCustAccountBalance() {
        return custAccountBalance;
    }

    public void setCustAccountBalance(double custAccountBalance) {
        this.custAccountBalance = custAccountBalance;
    }

    public BankAccount(){

    }

    public BankAccount(int custID, int custAccountBalance, int custAccountNumber, String custName,int limit){
        this.custAccountBalance=custAccountBalance;
        this.custAccountNumber=custAccountNumber;
        this.custID=custID;
        this.custName=custName;
        this.limit=limit;
    }


}
