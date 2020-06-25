package pkg01.oop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
public class Account {
    private String accountNumber;
    private int money;
    private String currency;
    
    public Account(String accountNumber, int money, String currency){
        this.accountNumber = accountNumber;
        this.money = money;
        this.currency = currency;
    }
    
    public void takeMoney(int money){
        if(this.money>money){
            this.money-=money;
            System.out.println("Your money successfully taken.");
        }else{
            System.out.println("You don't have enough money to take.");
        }
    }
    public void putMoney(int money){
        this.money += money;
        System.out.println("Your money successfully putted.");
    }
    public void ShowAccountInfo(){
        System.out.println("Account Number: " + this.accountNumber + "\nMoney: " + this.money + " " + this.currency);
    }
    
    public void makeTransaction(Account acc, int money){
        if(this.money>money){
            this.takeMoney(money);
            acc.putMoney(money);
        }else{
            System.out.println("You don't have enough money to take.");
        }
    }
}
