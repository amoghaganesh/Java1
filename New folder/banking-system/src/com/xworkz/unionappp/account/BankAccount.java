package com.xworkz.unionappp.account;

public class BankAccount {

    public double balance;

    public void debit(double amount){
    if (amount<balance){
        balance=balance-amount;
        }
        else System.out.println("insufficient balance");

    }

    public void credit(double amount){

        if(balance>0){
            balance=balance+amount;
        }
        else{
            System.out.println("balance is greater than 0");
        }
    }


}
