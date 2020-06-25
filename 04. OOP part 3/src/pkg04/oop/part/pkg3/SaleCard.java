/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.oop.part.pkg3;

/**
 *
 * @author George
 */
public class SaleCard {
    private int cardNumber;
    private int sale;
    private int moneySpended = 0;
    
    public SaleCard(){
        this.sale = 1;
        this.cardNumber = (int)(Math.random() * 900 + 200);
    }
    
    public void BuyProducts ( int prise){
        this.moneySpended += prise;
    }
    
    public void ShowSale(){
        this.sale = this.moneySpended / 1000 + 1;
        System.out.println("Your sale: " + this.sale + "%");
    }
    
    public void MissingForNewSale(){
        int missing = 1000 - (this.moneySpended % 1000);
        System.out.println("You need " + missing  + " to get a new sale");
    }
}
