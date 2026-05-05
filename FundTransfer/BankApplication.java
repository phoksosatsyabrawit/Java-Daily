package com.java.FundTransfer;

public class BankApplication {
    public static void main(String[] args){
        int numberofAccounts = 3;
        Bank bank = new Bank("E Crop", Bank.openAccount(numberofAccounts));
        bank.display();
        bank.transfer("000000000001", "000000000002", 150);
        System.out.println("\n #After transfering $150 from Elliot to Darlene...\n");
        bank.display();
    }
}
