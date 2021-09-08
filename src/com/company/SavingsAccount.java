package com.company;

public class SavingsAccount extends Account {
    double transactionFee = 2.50;
    double minimumSavings = 20;
    public SavingsAccount(String id, double initialDeposit){
        super(id,initialDeposit);
        if(balance >= 10000)
            super.balance = super.balance + 500;


    }
    public boolean withdraw(double amount){

    if(super.balance - amount < minimumSavings)
        return false;
    else{
       super.balance = super.balance - amount;
       return true;
    }

    }


    public void deposit(double amount) {
        super.balance = super.balance + amount;
    }

}
