package org.epam.bdd.pages;

public class Account {
    int balance;

    public Account(){}

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance(){
        return this.balance;
    }
    public void withdraw(int amount){
        if(amount<=balance){
            this.balance-=amount;
        }else{
            System.out.println("Insufficient funds to dispense $" + amount);
        }

    }
}
