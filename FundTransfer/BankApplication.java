package com.java.FundTransfer;

public class BankApplication {
    public static void main(String[] args){
        Bank bank = new Bank("E Crop", Bank.openAccount(3));
        bank.display();
        bank.transfer("000000000001", "000000000002", 150);
        System.out.println("\n #After transfering $150 from Elliot to Darlene...\n");
        bank.display();
    }
}
