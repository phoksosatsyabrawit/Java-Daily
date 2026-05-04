package com.java.FundTransfer;

public class BankApplication {
    public static void main(String[] args){
        /*BankAccount[] accounts = new BankAccount[] {
            new BankAccount("000000000001", "Elliot", 550),
            new BankAccount("000000000002", "Darlene", 350),
            new BankAccount("000000000003", "Tyrell", 250)
        };*/
        int numberofAccounts = 3;
        Bank bank = new Bank("E Crop", Bank.openAccount(numberofAccounts));
        bank.display(bank.bAccounts);
        bank.transfer("000000000001", "000000000002", 150);
        System.out.println("\n #After transfering $150 from Elliot to Darlene...\n");
        bank.display(bank.bAccounts);
    }
}
