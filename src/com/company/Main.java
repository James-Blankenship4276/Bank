package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat(".00");
        SavingsAccount s = new SavingsAccount("James " ,  400.00);
        SavingsAccount ss = new SavingsAccount("Blankenship " ,  1000.00);
        //System.out.println(s.getBalance());
       // s.withdraw(50);
        //System.out.println(s.getBalance());
        CheckingAccount c = new CheckingAccount("Cole ",800);
        //System.out.println(c.getBalance());
        //.deposit(50);
       //System.out.println(c.getBalance());
        //c.withdraw(80);
        //System.out.println(c.getBalance());
        Bank b = new Bank();
        System.out.println( "Account amount" +  b.numOfAccount());
        b.addAccount(s);
        b.addAccount(c);
        b.addAccount(ss);
        System.out.println(b.getAccount(ss.id));
        System.out.println(b.getAccount(s.id));
        System.out.println(b.getAccount(c.id));
        b.transfer(s.id,c.id,1);
        System.out.println(b.getAccount(s.id));
        System.out.println(b.getAccount(c.id));
        b.addInterest();
        System.out.println(b.getAccount(s.id));
        System.out.println(b.getAccount(c.id));
        b.deposit(s.id,10);
        b.deposit(c.id,2);
        System.out.println("Depsoit:"+ b.getAccount(s.id));
        System.out.println("Depsoit:"+ b.getAccount(c.id));
        b.withdraw(s.id, 10);
        b.withdraw(s.id, 1000);
        b.withdraw(c.id,5);
        b.withdraw(c.id,1000);
        System.out.println("Withdraw:" + b.getAccount(s.id));
        System.out.println("Withdraw:" + b.getAccount(c.id));

	// write your code here
    }
}
