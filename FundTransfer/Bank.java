package com.java.FundTransfer;
import java.util.Scanner;

public class Bank{

    private String bankName;
    private BankAccount[] accounts = new BankAccount[3];
    {   
        accounts[0] = new BankAccount("000000000001", "Elliot", 2500);
        accounts[1] = new BankAccount("000000000002", "Darlene", 1800);
        accounts[2] = new BankAccount("000000000003", "Tyrell", 2100);
    }
   
    // Constructor
    public Bank(String bankName){
        this.bankName = bankName;
    }
    public Bank(String bankName, BankAccount[] accounts){
        this.bankName = bankName;
        this.accounts = accounts;
    }

    protected BankAccount getAccount(){
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

    // Insert new account into existing accounts
    protected BankAccount[] openAccount(){
        int n= 1;
        BankAccount[] acc = new BankAccount[accounts.length + n];
        for(int i=0; i<accounts.length; i++){
            acc[i] = accounts[i];
        }
        acc[acc.length - n] = getAccount();
        return acc;
    }

    private BankAccount findAccount(String accNumber){
        for(BankAccount bAccount : accounts){
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

    public void display(){
        System.out.println("================================ # Bank Accounts # ================================");
        for(int i=0; i<accounts.length; i++){
            System.out.println("Bank " + getbankName() + ": " + accounts[i].toStr());
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
