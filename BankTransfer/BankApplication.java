package com.java.BankTransfer;

public class BankApplication {
    public static void main(String[] args){
        BankAccount[] bankAccounts = {
        new BankAccount("000000001", "dara", 300),
        new BankAccount("000000002", "thida", 200),
        new BankAccount("000000003", "cheata", 250)
        };
        Bank bank = new Bank("ABA", bankAccounts);
        bank.displayAccount(bankAccounts);
        bank.transfer("000000001", "000000003", 100);
        bank.displayAccount(bankAccounts);
    }
}
