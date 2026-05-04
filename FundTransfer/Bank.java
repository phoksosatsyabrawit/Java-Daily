package com.java.FundTransfer;
import java.util.Scanner;

public class Bank {

    private String bankName;
    BankAccount[] bAccounts;

    // Constructor
    public Bank(String bankName, BankAccount[] bAccounts){
        this.bankName = bankName;
        this.bAccounts = bAccounts;
    }

    protected static BankAccount getAccount(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String accNumber = scan.nextLine();
        System.out.print("Enter account name: ");
        String accName = scan.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scan.nextDouble();
        BankAccount account = new BankAccount(accNumber, accName, balance);
        return account;
    }

    protected static BankAccount[] openAccount(int n){
        BankAccount[] accounts = new BankAccount[n];
        for(int i=0; i<n; i++){
            accounts[i]= getAccount();
        }
        return accounts;
    }

    private BankAccount findAccount(String accNumber){
        for(BankAccount bAccount : bAccounts){
            if(bAccount.getaccNumber().equals(accNumber)){
                return bAccount;
            }
        }
        return null;
    }

    private boolean isEnoughBalance(BankAccount bAccount, double amount){
        return bAccount.getBalance() >= amount;
    }

    private boolean isValidAmount(double amount){
        return amount > 0;
    }

    private void withdraw(String accNumber, double amount){
        double newBalance = findAccount(accNumber).getBalance() - amount;
        findAccount(accNumber).setBalance(newBalance);
    }

    private void deposit(String accNumber, double amount){
        double newBalance = findAccount(accNumber).getBalance() + amount;
        findAccount(accNumber).setBalance(newBalance);
    }

    public void transfer(String sourceAcc, String targetAcc, double amount){
        if(findAccount(sourceAcc) == null || findAccount(targetAcc) == null){
            System.out.println("Invalid account.");
            return;
        }
        if(!isValidAmount(amount)){
            System.out.println("Invalid amount.");
            return;
        }
        withdraw(sourceAcc, amount);
        deposit(targetAcc, amount);
    }

    public void display(BankAccount[] bAccounts){
        System.out.println("================================ # Bank Accounts # ================================");
        for(BankAccount bAccount : bAccounts){
            System.out.println("Bank " + getbankName() + ": " + bAccount.toStr());
        }
    }

    // Setter
    public void setbankName(String bankName){
        this.bankName = bankName;
    }

    // Getter
    public String getbankName(){
        return bankName;
    }
}
