package com.java.FundTransfer;

public class BankAccount {

    private String accNumber;
    private String accName;
    private double balance;

    //Constructor
    public BankAccount(String accNumber, String accName, double balance){
        this.accNumber = accNumber;
        this.accName = accName;
        this.balance = balance;
    }

    // Setter
    public void setaccNubmer(String accNumber){
        this.accNumber = accNumber;
    }
    public void setaccName(String accName){
        this.accName = accName;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    // Getter
    public String getaccNumber(){
        return accNumber;
    }
    public String getaccName(){
        return accName;
    }
    public double getBalance(){
        return balance;
    }

    public String toStr(){
        return "[Account Number: " + getaccNumber() + ", Account Name: " + getaccName() + ", Balance: $" + getBalance() + "]";
    }
}