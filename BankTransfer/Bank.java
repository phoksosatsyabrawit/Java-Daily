package com.java.BankTransfer;

public class Bank {

    private String bankName;
    private BankAccount[] bankAccounts;
    /**/

    // Constructor
    public Bank(String bankName, BankAccount[] bankAccounts){
        this.bankName = bankName;
        this.bankAccounts = bankAccounts;
    }

    //check exist accountnumber
    private BankAccount getbankaccNumber(String accountNumber){
        for(BankAccount bankaccount : bankAccounts){
            if(bankaccount.getaccountNumber().equals(accountNumber)){
                return bankaccount;
            }
        }
        return null;
    }

    //check balance
    private boolean isenoughBalance(BankAccount bankAccount, double amount){
        /*if(bankAccount.getBalance() >= amount){
            return true;
        }
        return false;*/
        return bankAccount.getBalance() >= amount;
    }

    // check valid amount
    private boolean isvalidAmount(double amount){
        return amount > 0;
    }

    private void withdraw(BankAccount bankAccount, double amount){
        double balnace = bankAccount.getBalance() - amount;
        bankAccount.setBalance(balnace);
    }

    private void deposit(BankAccount bankAccount, double amount){
        double balnace = bankAccount.getBalance() + amount;
        bankAccount.setBalance(balnace);
    }

    public void transfer(String accSource, String accTarget, double acmount){
         BankAccount source = getbankaccNumber(accSource);
         if(source == null){
            System.out.println("Invalid Soucre Account.");
            return;
         }
         BankAccount target = getbankaccNumber(accTarget);
         if(target == null){
            System.out.println("Invalid Target Account.");
            return;
         }
         Boolean isenoughBalance = isenoughBalance(source, acmount);
         if(!isenoughBalance){
            System.out.println("Balance is not enough.");
            return;
         }
         if(!isvalidAmount(acmount)){
            System.out.println("Amount must be greater than zero.");
            return;
         }
         withdraw(source, acmount);
         deposit(target, acmount);
    }

    public void displayAccount(BankAccount[] bankAccounts){
        for(BankAccount bankAccount : bankAccounts){
            System.out.println(bankAccount.toStr());
        }
    }
}
