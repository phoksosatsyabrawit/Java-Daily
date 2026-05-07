package com.java.FundTransfer;

public class BankApplication {
    public static void main(String[] args){
        Bank bank = new Bank("ABA");
        bank.display();
        BankAccount[] newAcc = bank.openAccount();
        Bank banks = new Bank("ABA", newAcc);
        System.out.println("\nNew account has been created successfully!\n");
        banks.display();
        System.out.println("\nTransfering $500 from Elliot to Bravit.\n");
        banks.transfer("000000000001", "000000000004", 500);
        banks.display();
    }
}
