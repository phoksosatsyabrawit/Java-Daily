package com.java.FundTransfer;

public class BankApplication {
    public static void main(String[] args){
        int numberofAcc = 1;
        Bank existAcc = new Bank("ABA");
        existAcc.display();
        BankAccount[] newAcc = Bank.openAccount(numberofAcc);
        Bank bank = new Bank("ABA", newAcc);
        System.out.println("\nNew account has been created successfully!\n");
        bank.display();
        System.out.println("\nTransfering $500 from Elliot to Bravit.\n");
        bank.transfer("000000000001", "000000000004", 500);
        bank.display();
    }
}
