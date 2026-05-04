package com.java.BankTransfer;

public class BankAccount {

    private String accountNumber;
    private String accountName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountName, double balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    // Setter
    public void setaccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setaccountName(String accountName){
        this.accountName = accountName;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    // Getter
    public String getaccountNumber(){
        return accountNumber;
    }
    public String getaccountName(){
        return accountName;
    }
    public double getBalance(){
        return balance;
    }

    // toStr to Disply information
    public String toStr(){
        return "BankAccount [accountnumber: " + getaccountNumber() + ", accountname: " + getaccountName() + ", balance: " + getBalance() + "]";
    }
}
