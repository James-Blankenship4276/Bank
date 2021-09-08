package com.company;

public abstract  class Account {
    protected String id;
    protected double balance;

    public Account(String id1, double balance1) {
        id = id1;
        balance = balance1;
    }

    public double getBalance(){
        return balance;
    }
    public String getId(){
        return id;
    }
    public  String toString(){

        return  id + balance;
    }
    public abstract boolean withdraw(double amount);
    public abstract  void deposit(double amount);

}

