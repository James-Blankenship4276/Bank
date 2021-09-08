package com.company;

public class CheckingAccount extends Account{
    double transactionFee = 1;

    private int checkCount = 0;

    public CheckingAccount(String id, double balance) {
        super(id, balance);
    }

    public boolean withdraw(double amount) {
        if(super.balance - amount < -10)
        return false;
        else {
           super.balance =  super.balance - (amount + transactionFee);
           return true;
        }
    }


    public void deposit(double amount) {
        super.balance = (super.balance + amount) - transactionFee;
    }

    public int getChecksUsed(){
        return checkCount;
    }
    public boolean withdrawUsingCheck(double amount){
    if(checkCount > 3)
        if (super.balance  - (amount + transactionFee) <  -10 )
            return false;
        else {

            super.balance = super.balance - (amount + transactionFee);
            return true;
        }

        if(checkCount < 3)
            if(super.balance - amount < -10)
                return false;
            else{

                super.balance = super.balance - amount;
                return true;
            }



    return true;
    }
    public void resetChecksUsed(){
        checkCount = 0;
    }

}
