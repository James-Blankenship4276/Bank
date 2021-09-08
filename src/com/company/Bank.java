package com.company;

import javax.lang.model.type.NullType;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> account = new ArrayList<Account>();
    private double savingsInterestRate = 0;
    CheckingAccount c = new CheckingAccount("null", 0);
    //SavingsAccount s = new SavingsAccount("null", 0);


    public Bank() {
        account = new ArrayList<Account>();
    }

    public void setSavingsInterestRate(double rate) {

        savingsInterestRate = rate;
    }

    public int numOfAccount() {
        int size = account.size();
        return size;
    }

    public void addAccount(Account a) {

        account.add(a);
    }

    public Account getAccount(String accountID) {

        for (int i = 0; i < account.size(); i++) {
            if (accountID.equals( account.get(i).id))
                return account.get(i);
        }
        return null;

    }

    public boolean deposit(String accountID, double amount) {

         for (int i = 0; i < account.size(); i++) {
            if (accountID.equals( account.get(i).id)) {
                account.get(i).balance = account.get(i).balance + amount;
                return true;
            }
        }
        return false;


    }

    public boolean withdraw(String accountID, double amount) {

        for (int i = 0; i < account.size(); i++) {
            if (account.get(i).id.equals(accountID)) {
                if (account.get(i).balance > amount) {
                    System.out.println(accountID + " " + "suffficant Ballace ");
                    account.get(i).balance = account.get(i).balance - amount;
                    return true;
                } else {
                    System.out.println(accountID + " " + "insuffficant Ballace ");
                    return false;


                }
            }
        }
        return false;
    }

    public boolean transfer(String fromAccountID, String toAccountID, double amount) {
        //int i = 0;
        int fromidpostion = 0;
        for(int i = 0; i < account.size(); i++){
            if(account.get(i).id.equals(fromAccountID)){

               fromidpostion= i;
            }
        }
        if(account.get(fromidpostion) instanceof CheckingAccount){
            if (account.get(fromidpostion).balance - (amount + c.transactionFee) < -10) {
                return false;
            }
        }
            else {
                if (account.get(fromidpostion).balance < amount)
                    return false;
            }

        for (int j = 0; j < account.size(); j++)
            if (account.get(j).id.equals(toAccountID)) {
                account.get(fromidpostion).balance = account.get(fromidpostion).balance - amount;
                account.get(j).balance = account.get(j).balance + amount;
                return true;
            }
        return false;
    }

    public void addInterest() {
        int i;
        //System.out.println(s instanceof SavingsAccount);
        for (i = 0; i < account.size(); i++) {
            if (account.get(i) instanceof SavingsAccount) {
                account.get(i).balance = (account.get(i).balance * savingsInterestRate) + account.get(i).balance;
            }
            else{
                System.out.println(account.get(i).id + "Is not apllicaple");


            }
        }


    }
    public void reset(){
        CheckingAccount c = new CheckingAccount("Null",0);
        for (int i = 0; i <account.size(); i++){
            if(account.get(i) instanceof  CheckingAccount){
                Bank b = new Bank();
            }
        }
    }
}
